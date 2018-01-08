package game;

import java.util.Scanner;

import mecanique.EtatAttente;
import mecanique.EtatJouer;
import mecanique.Joueur;

public class Main {

	public static void main(String[] args) {
		
		Jeux jeu1 = new Jeux();
		
		Joueur j1 = new Joueur("Samix", null);
		Joueur j2 = new Joueur("Cedric", null);
		
		jeu1.initialisationPartie(j1, j2);
		
		EtatJouer joue = new EtatJouer();
		EtatAttente enAttente = new EtatAttente();
		
		joue.etatJouer(j1);
		enAttente.etatJouer(j2);
		System.out.println("------------------Etat de depart------------------");
		System.out.println("joueur1 : " + j1.getEtat());
		System.out.println("joueur2 : " + j2.getEtat());
		
		jeu1.changementDeTour(j1, j2);
		jeu1.changementDeTour(j1, j2);
		
		// TODO Auto-generated method stub
		//TODO Scanner
	}

}
