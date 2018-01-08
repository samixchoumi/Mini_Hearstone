package game;

import card.FactoryCard;
import card.commune.*;
import card.guerrier.*;
import card.mage.*;
import card.paladin.*;
import mecanique.Joueur;

public class Jeux {
	
	public void changementDeTour(){
		//TODO DP State
	}
	
	//TODO Decorator pour Heros
	
	public void observationEffectCarte(){
		//TODO DP Observer (et DP State)
	}
	
	public void pointDeMana(Joueur j){
		//TODO +1 par tour (max 10)
		int manaJoueur = j.getMana();
		if(manaJoueur == 10){
			j.setMana(10);
		} else if (manaJoueur < 10 && manaJoueur > 0){
			j.setMana(manaJoueur++);
		} else {
			System.out.println("Erreur - Mana hors norme, il ne faut pas tricher !");
			j.setMana(1);
		}
	}
}
