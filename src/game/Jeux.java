package game;

import java.util.ArrayList;

import card.FactoryCard;
import card.effect.Effect1DegatTOUSServiteur;
import card.effect.EffectCharge;
import card.effect.EffectConfere3AttaqueUnServiteur;
import card.effect.EffectDecorator;
import card.effect.EffectInflige2DegatTousAdv;
import card.effect.EffectInfligeDegatAdversaire;
import card.effect.EffectInvoqueDeuxServiteurs;
import card.effect.EffectMaitriseDuBlocage;
import card.effect.EffectMetamorphose;
import card.effect.EffectPlus1AttaqueToutServiteurAllie;
import card.effect.EffectProvocation;
import card.effect.EffectVolDeVie;
import hero.Heros;
import mecanique.EtatAttente;
import mecanique.EtatJouer;
import mecanique.Joueur;
import power.Power;

/**
 * Classe mettant en place les actions du jeu
 * @author Samix-PC
 */
public class Jeux {
	public ArrayList<FactoryCard> Board = new ArrayList<FactoryCard>();
	
	/**
	 * Initialise la partie de jeu 
	 * @param j1 etant le joueur 1
	 * @param j2 etant le joueur 2
	 * @return le resultat du random a prendre en compte lors de l'initialisation de la main
	 */
	public int initialisationPartie(Joueur j1, Joueur j2){
		int lower = 1 , higher = 3;
		int random = (int)(Math.random()*(higher-lower)) + lower;
		System.out.println("random == " + random);
		if(random == 1){
			j1.initialiseMain(random);
			System.out.println("---------");
			j2.initialiseMain(2);
		} else {
			j1.initialiseMain(random);
			System.out.println("---------");
			j2.initialiseMain(1);
		}
		return random;
	}
	
	/**
	 * Methode permettant de changer de tour et de mettre ainsi l'etat du joueur a jour
	 * @param j1 etant le joueur 1
	 * @param j2 etant le joueur 2
	 */
	public void changementDeTour(Joueur j1, Joueur j2){
		EtatJouer joue = new EtatJouer();
		EtatAttente enAttente = new EtatAttente();
		
		System.out.println("------------------Changement de Tour------------------");
		
		if (j1.getEtat().toString().equals("En jeu") && j2.getEtat().toString().equals("En Attente")){
			joue.etatJouer(j2);
			enAttente.etatJouer(j1);
			
			//clearscreen
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			j2.addCardMain();
			
			affichageBoard(j2, j1);
			
			System.out.println(j1.getName() +" : " + j1.getEtat());
			System.out.println(j2.getName() +" : " + j2.getEtat());
			
			pointDeMana(j2);
		}else if (j1.getEtat().toString().equals("En Attente") && j2.getEtat().toString().equals("En jeu")) {
			joue.etatJouer(j1);
			enAttente.etatJouer(j2);
			
			//clearscreen
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			j1.addCardMain();
			
			affichageBoard(j1, j2);
			
			System.out.println(j1.getName() +" : " + j1.getEtat());
			System.out.println(j2.getName() +" : " + j2.getEtat());
			
			pointDeMana(j1);
		}
	}
	
	/**
	 * Observe l'effet d'une carte
	 * @param card etant la carte a observer
	 */
	public void observationEffectCarte(FactoryCard card){
		System.out.println(card.getEffect());
	}
	
	/**
	 * Methode qui verifie si le cout en mana d'une carte a jouer est bien possible avec le mana du joueur
	 * @param j le joueur dont on doit verifier les infos
	 * @param card la carte jouer par le joueur
	 * @return un boolean indiquant si il est possible de jouer la carte ou non
	 */
	public boolean coutManaCarteDiffPointDeManCourant(Joueur j, FactoryCard card){
		if (j.getMana() >= card.getMana()){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * met a jour les points de mana du joueur a chaque tour en limitant a 10
	 * @param j etant le joueur
	 */
	public void pointDeMana(Joueur j){
		int manaJoueur = j.getMana();
		if(manaJoueur == 10){
			j.setMana(10);
		} else if (manaJoueur < 10){
			j.setMana(manaJoueur+1);
		} else {
			System.out.println("Erreur - Mana hors norme, il ne faut pas tricher !");
			j.setMana(1);
		}
	}
	
	/**
	 * Affiche le board du joueur
	 * @param j le joueur jouant
	 * @param jAdv le joueur adverse pour afficher ses cartes en jeu
	 */
	public void affichageBoard(Joueur j, Joueur jAdv){
		System.out.println("________________________________________________");
		System.out.println("Carte en jeu de " +jAdv.getName()+ ":");
		jAdv.afficherCardJeu();
		System.out.println("________________________________________________");
		System.out.println("Vos carte en jeu :");
		j.afficherCardJeu();
		System.out.println("________________________________________________");
		System.out.println("Vos carte en main :");
		j.afficherCardMain();
		System.out.println("________________________________________________");
		j.afficherInfoJoueur();
		System.out.println("________________________________________________");
	}
	
	/**
	 * Methode qui joue la carte et utilise son effet
	 * @param card etant la carte joue
	 */
	public void joueCarte(FactoryCard card){
		observationEffectCarte(card);
		EffectDecorator effect;
		if (card.getEffect().contains("Image miroir")){
			effect = new EffectInvoqueDeuxServiteurs(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Provocation")){
			effect = new EffectProvocation(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Tourbillon")){
			effect = new Effect1DegatTOUSServiteur(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Charge")){
			effect = new EffectCharge(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Benediction de puissance")){
			effect = new EffectConfere3AttaqueUnServiteur(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Consecration")){
			effect = new EffectInflige2DegatTousAdv(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("ExplosionDesArcanes")){
			effect = new EffectInfligeDegatAdversaire(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Maitrise du blocage")){
			effect = new EffectMaitriseDuBlocage(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Metamorphose")){
			effect = new EffectMetamorphose(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Metamorphose")){
			effect = new EffectMetamorphose(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Plus 1 d attaque")){
			effect = new EffectPlus1AttaqueToutServiteurAllie(card);
			effect.useEffect();
		}
		if (card.getEffect().contains("Vol de vie")){
			effect = new EffectVolDeVie(card);
			effect.useEffect();
		}		
	}
	
	/**
	 * Affichage du board
	 */
	public void afficherBoard(){
		System.out.println("----------Affichage du board----------");
		for(FactoryCard c : Board){
			System.out.println("|" + Board.indexOf(c) + "|" + c.toString() /*Faire les toString des cartes (en gros ajouter leur nom)*/);
		}
	}
	
	/**
	 * Methode qui utilise le pouvoir du heros
	 * @param h etant le heros du joueur
	 */
	public void joueHeroPower(Power h){
		System.out.println(h.getPower());
		h.usePower();
	}
}
