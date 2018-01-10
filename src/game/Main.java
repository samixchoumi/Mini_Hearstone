package game;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import mecanique.EtatAttente;
import mecanique.EtatJouer;
import mecanique.Joueur;

//TODO METTRE LES MEME CARACTERISTIQUES AUX CARTES AINSI QU AUX EFFETS POUR FAIRE LES SET CORRECTEMENT DANS LES EFFETS. //Samix
//TODO CREER LES EFFETS AINSI QUE LES AJOUTER AU JOUEUR //Cedricmart8
//TODO DP Observer pour utiliser les effets quand une carte est mise en jeux //Cedricmart8
//TODO Javadoc sur decorator et factory //Samix
//TODO faire les actions du tour //Samix et cedricmart8

public class Main {

	public static void main(String[] args) {
		
		Jeux jeu1 = new Jeux();
		
		/*
		 * Creation des joueurs
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Joueur 1 : Veuillez choisir un pseudo : ");
		String joueur1Pseudo = sc.nextLine();
		System.out.println("Joueur 2 : Veuillez choisir un pseudo : ");
		String joueur2Pseudo = sc.nextLine();
		
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
		
		/*
		Joueur j1 = new Joueur("Samix", "Mage");
		Joueur j2 = new Joueur("Cedric", "Mage");
		*/
		jeu1.initialisationPartie(j1, j2);
		
		EtatJouer joue = new EtatJouer();
		EtatAttente enAttente = new EtatAttente();
		
		joue.etatJouer(j1);
		enAttente.etatJouer(j2);
		System.out.println("------------------Etat de depart------------------");
		System.out.println("joueur1 : " + j1.getEtat());
		System.out.println("joueur2 : " + j2.getEtat());
		
		while(j1.getHeros().getLife() != 0 || j1.getHeros().getLife() != 0){
			String finTour = sc.nextLine();
			if(finTour.equals("finTour"))
				jeu1.changementDeTour(j1, j2);
			else
				break;
		}
		
		//TODO Scanner
	}

}
