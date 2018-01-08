package game;

import mecanique.EtatAttente;
import mecanique.EtatJouer;
import mecanique.Joueur;

public class Jeux {
	public void tirageCarte(){
		//TODO SwitchCase factoryCarte DP Factory Method
	}
	
	public void changementDeTour(Joueur j1, Joueur j2){
		//TODO DP State
		EtatJouer joue = new EtatJouer();
		EtatAttente enAttente = new EtatAttente();
		
		System.out.println("------------------Changement de Tour------------------");
		
		if (j1.getEtat().toString().equals("En jeu") && j2.getEtat().toString().equals("En Attente")){
			
			enAttente.etatJouer(j1);
			joue.etatJouer(j2);
			
			System.out.println("joueur1 : " + j1.getEtat());
			System.out.println("joueur2 : " + j2.getEtat());
			
		}else if (j1.getEtat().toString().equals("En Attente") && j2.getEtat().toString().equals("En jeu")) {
			
			joue.etatJouer(j1);
			enAttente.etatJouer(j2);
			
			System.out.println("joueur1 : " + j1.getEtat());
			System.out.println("joueur2 : " + j2.getEtat());
			
		}
		
		
	}
	
	//TODO Decorator pour Heros
	
	public void observationEffectCarte(){
		//TODO DP Observer (et DP State)
	}
	
	public void pointDeMana(Joueur j){
		//TODO +1 par tour (max 10)
	}
}
