package game;

import java.util.Scanner;

import card.FactoryCard;
import mecanique.EtatAttente;
import mecanique.EtatJouer;
import mecanique.Joueur;
import power.Power;

public class Main {

	public static void main(String[] args) {
		
		Jeux jeu1 = new Jeux();
		
		/*
		 * Creation des joueurs
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Joueur 1 : Veuillez choisir un pseudo : ");
		String joueur1Pseudo = sc.nextLine();
		while ( joueur1Pseudo.isEmpty()){
			System.out.println("Joueur 1 vide !");

			System.out.println("Joueur 1 : Veuillez choisir un pseudo : ");
			joueur1Pseudo = sc.nextLine();
		}
		System.out.println("Joueur 2 : Veuillez choisir un pseudo : ");
		String joueur2Pseudo = sc.nextLine();
		while ( joueur2Pseudo.isEmpty()){
			System.out.println("Joueur 2 vide !");

			System.out.println("Joueur 2 : Veuillez choisir un pseudo : ");
			joueur2Pseudo = sc.nextLine();
		}
		
		System.out.println("Joueur 1 : Veuillez choisir un heros (Mage|Guerrier|Paladin) : ");
		String joueur1Heros = sc.nextLine();
		while(!((joueur1Heros.equalsIgnoreCase("mage")) || (joueur1Heros.equalsIgnoreCase("paladin")) || (joueur1Heros.equalsIgnoreCase("guerrier")))){
			System.out.println("Erreur lors de la saisis, veuillez choisir un bon heros !");
			System.out.println("Joueur 1 : Veuillez choisir un heros (Mage|Guerrier|Paladin) : ");
			joueur1Heros = sc.nextLine();
		}
			
		System.out.println("Joueur 2 : Veuillez choisir un heros (Mage|Guerrier|Paladin) : ");
		String joueur2Heros = sc.nextLine();
		while(!((joueur2Heros.equalsIgnoreCase("mage")) || (joueur2Heros.equalsIgnoreCase("paladin")) || (joueur2Heros.equalsIgnoreCase("guerrier")))){
			System.out.println("Erreur lors de la saisis, veuillez choisir un bon heros !");
			System.out.println("Joueur 2 : Veuillez choisir un heros (Mage|Guerrier|Paladin) : ");
			joueur2Heros = sc.nextLine();
		}
		
		System.err.println("psd1+>"+joueur1Pseudo);
		System.err.println("psd2+>"+joueur2Pseudo);
		System.err.println("her1+>"+joueur1Heros);
		System.err.println("her2+>"+joueur2Heros);
		// a ameliorer
		Joueur j2 = null;
		Joueur j1 = null;
		j2 = new Joueur(joueur2Pseudo);
		j1 = new Joueur(joueur1Pseudo,joueur1Heros, j2);
		j2.setJoueurAdv(j1);
		j2.setHeros(joueur2Heros);
		
		int initialisation = jeu1.initialisationPartie(j1, j2);
		
		EtatJouer joue = new EtatJouer();
		EtatAttente enAttente = new EtatAttente();
		

		
		
		if(initialisation == 1){
			joue.etatJouer(j1);
			enAttente.etatJouer(j2);
			
			//clearscreen
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
			jeu1.affichageBoard(j1, j2);
						
			//test
			System.out.println("------------------Etat de depart------------------");
			System.out.println(j1.getName() +" : " + j1.getEtat());
			System.out.println(j2.getName() +" : " + j2.getEtat());
			jeu1.pointDeMana(j1);
		} else {
			joue.etatJouer(j2);
			enAttente.etatJouer(j1);
						
			//clearscreen
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
			jeu1.affichageBoard(j2, j1);
			
			//test
			System.out.println("------------------Etat de depart------------------");
			System.out.println(j1.getName() +" : " + j1.getEtat());
			System.out.println(j2.getName() +" : " + j2.getEtat());
			jeu1.pointDeMana(j2);
		}
		
		while(j1.getHeros().getLife() != 0 || j2.getHeros().getLife() != 0){
			Joueur joueurEnJeu = j1;
			Joueur joueurAdv = j2;

			int manaTour = joueurEnJeu.getMana();
			
			if (j1.getEtat().toString().equals("En jeu")){
				joueurEnJeu = j1;
				joueurAdv = j2;
			} else {
				joueurEnJeu = j2;
				joueurAdv = j1;
			}
			System.out.println("Que voulez vous faire ? (attaqueCarte | attaqueHero | joueCarte | joueHeroPower | voirMain | finTour)");
			String choix = sc.nextLine();
			if(choix.equalsIgnoreCase("joueCarte")){
				//regler le soucis du fais qu'on peut directement attaquer avec n'importe quel carte
				System.out.println("Jouer quelle carte ? (numero)");
				String idCarte = sc.nextLine();
				System.out.println("Mana courant : " + manaTour);
				for (FactoryCard card : joueurEnJeu.getListeCarteDuJoueurMain()){
					if(!idCarte.equals("")){
						if (Integer.parseInt(idCarte) == joueurEnJeu.getListeCarteDuJoueurMain().indexOf(card)){
							if (jeu1.coutManaCarteDiffPointDeManCourant(joueurEnJeu, card) == true){
								jeu1.Board.add(card);
								jeu1.joueCarte(card);					
								manaTour = manaTour - card.getMana();
							} else {
								System.out.println("pas assez de mana ! ");
							}
						}
					}
				}
				jeu1.afficherBoard();
			};
			
			if(choix.equalsIgnoreCase("joueHeroPower")){
				jeu1.joueHeroPower((Power) joueurEnJeu.getHeros());
			}			
			
			if(choix.equalsIgnoreCase("attaqueHero")){
				//regler le soucis pour que ça rentre dans la boucle
				for (FactoryCard card : joueurAdv.getListeCarteEnJeux()){
					System.err.println("test");
					if(card.getEffect().contains("Provocation")){
						System.out.println("Il est impossible d'attaquer le heros, il y a une carte avec un effet provocation"
								+ "\n" + card.getEffect());
					} else {
						System.out.println("Attaquer avec quelle carte ? (numero)");
						String idCarte = sc.nextLine();
						for (FactoryCard card2 : joueurEnJeu.getListeCarteEnJeux()){
							if(!idCarte.equals("")){
								if (Integer.parseInt(idCarte) == joueurEnJeu.getListeCarteEnJeux().indexOf(card2)){
									joueurEnJeu.getJoueurAdv().getHeros().setLife(joueurEnJeu.getJoueurAdv().getHeros().getLife() - card2.getAttaque());
								}
							}
						}
					}
				}
				jeu1.affichageBoard(joueurEnJeu, joueurAdv);
			}
			
			if(choix.equalsIgnoreCase("voirMain")){
				joueurEnJeu.afficherCardMain();
			}
			
			if(choix.equalsIgnoreCase("attaqueCarte")){
				FactoryCard fcAttaque = null;
				System.out.println("Attaquer avec quelle carte ? (numero)");
				String idCarte = sc.nextLine();
				for (FactoryCard card3 : joueurEnJeu.getListeCarteEnJeux()){
					if(!idCarte.equals("")){
						if (Integer.parseInt(idCarte) == joueurEnJeu.getListeCarteEnJeux().indexOf(card3)){
							fcAttaque = card3;
						}
					}
				}
				
				//Regler le soucis de provocation
				System.out.println("Attaquer quelle carte ? (numero)");
				String idCarte2 = sc.nextLine();
				for (FactoryCard card : joueurEnJeu.getJoueurAdv().getListeCarteEnJeux()){
					if(card.getEffect().contains("Provocation")){
						System.out.println("Il est impossible d'attaquer cette carte, il y a une carte avec un effet provocation"
								+ "\n" + card.getEffect());
					} else {
						for (FactoryCard card2 : joueurEnJeu.getListeCarteEnJeux()){
							if(!idCarte2.equals("")){
								if (Integer.parseInt(idCarte2) == joueurEnJeu.getListeCarteEnJeux().indexOf(card2)){
									card2.setLife(card2.getLife() - fcAttaque.getAttaque());
								}
							}
						}
					}
				}
			}
			
			if(choix.equalsIgnoreCase("finTour"))
				jeu1.changementDeTour(j1, j2);
			
			else if(!choix.equalsIgnoreCase("voirMain") && !choix.equalsIgnoreCase("attaqueCarte") && !choix.equalsIgnoreCase("attaqueHero") && !choix.equalsIgnoreCase("joueCarte") && !choix.equalsIgnoreCase("joueHeroPower") && !choix.equalsIgnoreCase("finTour")){
				System.out.println("erreur de saisie !");
			}
		}
		
		if(j1.getHeros().getLife() == 0)
			j1.setEnVie(false);
		if(j2.getHeros().getLife() == 0)
			j2.setEnVie(false);
		
		if(j1.isEnVie() == true)
			System.out.println(j1.getName()+" a gagne ! Felicitation !");
		else
			System.out.println(j2.getName()+" a gagne ! Felicitation !");
		
	}

}
