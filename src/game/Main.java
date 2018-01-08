package game;

import java.util.Scanner;

import mecanique.EtatAttente;
import mecanique.EtatJouer;
import mecanique.Joueur;

public class Main {

	public static void main(String[] args) {
		
		Jeux jeu1 = new Jeux();
		
		Joueur joueur1 = new Joueur(null, null);
		Joueur joueur2 = new Joueur(null, null);
		
		EtatJouer joue = new EtatJouer();
		EtatAttente enAttente = new EtatAttente();
		
		joue.etatJouer(joueur1);
		enAttente.etatJouer(joueur2);
		System.out.println("------------------Etat de depart------------------");
		System.out.println("joueur1 : " + joueur1.getEtat());
		System.out.println("joueur2 : " + joueur2.getEtat());
		
		jeu1.changementDeTour(joueur1, joueur2);
		jeu1.changementDeTour(joueur1, joueur2);
		
		// TODO Auto-generated method stub
		//TODO Scanner
	}

}
