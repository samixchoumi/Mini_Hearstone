package mecanique;

import java.util.ArrayList;

import card.FactoryCard;
import card.commune.CardChefDeRaid;
import card.commune.CardChevaucheurDeLoup;
import card.commune.CardSanglierBrocheroc;
import card.commune.CardSoldatDuComteDeLor;
import card.commune.CardYetiNoroit;
import card.guerrier.CardAvocatCommisDoffice;
import card.guerrier.CardMaitriseDuBlocage;
import card.guerrier.CardTourbillon;
import card.mage.CardExplosionDesArcanes;
import card.mage.CardImageMiroir;
import card.mage.CardMetamorphose;
import card.paladin.CardBenedictionDePuissance;
import card.paladin.CardChampionFrisselame;
import card.paladin.CardConsecration;
import hero.*;

public class Joueur {
	private String name;
	private boolean enVie;
	private int mana;
	private Heros heros;
	private ArrayList<FactoryCard> listeCarteDuJoueurMain;
	private ArrayList<FactoryCard> listeCarteEnJeux;
	
	public Joueur(String name, String heros) {
		this.name = name;
		this.enVie = true;
		this.mana = 1;
		this.heros = null;
		setHeros(heros);
	}

	public boolean isEnVie() {
		return enVie;
	}

	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}

	public Heros getHeros() {
		return heros;
	}

	public void setHeros(String heros) {
		if(heros != null){
			System.out.println("Heros deja attribue");
		} else if(heros == "Mage"){
			this.heros = new HerosMage();
		} else if(heros == "Guerrier"){
			this.heros = new HerosGuerrier();
		} else if(heros == "Paladin"){
			this.heros = new HerosPaladin();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public FactoryCard tirageCarte(){
		int lower = 1 , higher = 9;
		int random = (int)(Math.random()*(higher-lower)) + lower;
		
		FactoryCard fc = null;
		Joueur j1 = null;
		if(j1.getHeros().typeHero() == "Mage"){
			switch (random) {
				case 1: fc = new CardChefDeRaid();
				return fc;
				case 2: fc = new CardChevaucheurDeLoup();
				return fc;
				case 3: fc = new CardSanglierBrocheroc();
				return fc;
				case 4: fc = new CardSoldatDuComteDeLor();
				return fc;
				case 5: fc = new CardYetiNoroit();
				return fc;
				case 6: fc = new CardExplosionDesArcanes();
				return fc;
				case 7: fc = new CardImageMiroir();
				return fc;
				case 8: fc = new CardMetamorphose();
				return fc;
			}
		} else if(j1.getHeros().typeHero() == "Guerrier"){
			switch (random) {
				case 1: fc = new CardChefDeRaid();
				return fc;
				case 2: fc = new CardChevaucheurDeLoup();
				return fc;
				case 3: fc = new CardSanglierBrocheroc();
				return fc;
				case 4: fc = new CardSoldatDuComteDeLor();
				return fc;
				case 5: fc = new CardYetiNoroit();
				return fc;
				case 6: fc = new CardAvocatCommisDoffice();
				return fc;
				case 7: fc = new CardMaitriseDuBlocage();
				return fc;
				case 8: fc = new CardTourbillon();
				return fc;
			}
		} else if(j1.getHeros().typeHero() == "Paladin"){
			switch (random) {
				case 1: fc = new CardChefDeRaid();
				return fc;
				case 2: fc = new CardChevaucheurDeLoup();
				return fc;
				case 3: fc = new CardSanglierBrocheroc();
				return fc;
				case 4: fc = new CardSoldatDuComteDeLor();
				return fc;
				case 5: fc = new CardYetiNoroit();
				return fc;
				case 6: fc = new CardBenedictionDePuissance();
				return fc;
				case 7: fc = new CardChampionFrisselame();
				return fc;
				case 8: fc = new CardConsecration();
				return fc;
			}
		}
		return fc;
	}
	
	public void initialiseMain(){
		//methode de test
		addCardMain();
		addCardMain();
		addCardMain();
	}
	
	public void addCardMain(){
		FactoryCard carteAjout = tirageCarte();
		System.out.println(carteAjout + "A ete ajoute a votre main !");
		listeCarteDuJoueurMain.add(carteAjout);
	}
	
	public void addCardJeu(){
		int NumeroDeLaCarteDansLaMain = 1;
		FactoryCard carteAJouer = listeCarteDuJoueurMain.get(NumeroDeLaCarteDansLaMain);
		listeCarteEnJeux.add(carteAJouer);
	}
}
