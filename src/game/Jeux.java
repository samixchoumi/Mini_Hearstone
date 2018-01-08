package game;

import card.FactoryCard;
import card.commune.*;
import card.guerrier.*;
import card.mage.*;
import card.paladin.*;
import mecanique.Joueur;

public class Jeux {
	
	Joueur j1 = new Joueur("Samix", "Mage"), j2 = new Joueur("Cedric", "Guerrier");
	
	public void tirageCarte(){
		//TODO SwitchCase factoryCarte DP Factory Method
		
		int lower = 1 , higher = 9;
		int random = (int)(Math.random()*(higher-lower)) + lower;
		
		FactoryCard fc = null;
		Joueur j1 = null;
		if(j1.getHeros().typeHero() == "Mage"){
			switch (random) {
				case 1: fc = new CardChefDeRaid();
			        break;
				case 2: fc = new CardChevaucheurDeLoup();
			        break;
				case 3: fc = new CardSanglierBrocheroc();
			        break;
				case 4: fc = new CardSoldatDuComteDeLor();
			        break;
				case 5: fc = new CardYetiNoroit();
			        break;
				case 6: fc = new CardExplosionDesArcanes();
			        break;
				case 7: fc = new CardImageMiroir();
			        break;
				case 8: fc = new CardMetamorphose();
			        break;
			}
		} else if(j1.getHeros().typeHero() == "Guerrier"){
			switch (random) {
				case 1: fc = new CardChefDeRaid();
			        break;
				case 2: fc = new CardChevaucheurDeLoup();
			        break;
				case 3: fc = new CardSanglierBrocheroc();
			        break;
				case 4: fc = new CardSoldatDuComteDeLor();
			        break;
				case 5: fc = new CardYetiNoroit();
			        break;
				case 6: fc = new CardAvocatCommisDoffice();
			        break;
				case 7: fc = new CardMaitriseDuBlocage();
			        break;
				case 8: fc = new CardTourbillon();
			        break;
			}
		} else if(j1.getHeros().typeHero() == "Paladin"){
			switch (random) {
				case 1: fc = new CardChefDeRaid();
			        break;
				case 2: fc = new CardChevaucheurDeLoup();
			        break;
				case 3: fc = new CardSanglierBrocheroc();
			        break;
				case 4: fc = new CardSoldatDuComteDeLor();
			        break;
				case 5: fc = new CardYetiNoroit();
			        break;
				case 6: fc = new CardBenedictionDePuissance();
			        break;
				case 7: fc = new CardChampionFrisselame();
			        break;
				case 8: fc = new CardConsecration();
			        break;
			}
		}
	}
	
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
