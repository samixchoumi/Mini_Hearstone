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
	private Etat etat;
	private ArrayList<FactoryCard> listeCarteDuJoueurMain;
	private ArrayList<FactoryCard> listeCarteEnJeux;
	
	public ArrayList<FactoryCard> getListeCarteDuJoueurMain() {
		return listeCarteDuJoueurMain;
	}

	public void setListeCarteDuJoueurMain(ArrayList<FactoryCard> listeCarteDuJoueurMain) {
		this.listeCarteDuJoueurMain = listeCarteDuJoueurMain;
	}

	public ArrayList<FactoryCard> getListeCarteEnJeux() {
		return listeCarteEnJeux;
	}

	public void setListeCarteEnJeux(ArrayList<FactoryCard> listeCarteEnJeux) {
		this.listeCarteEnJeux = listeCarteEnJeux;
	}

	public Joueur(String name, String heros) {
		this.name = name;
		this.enVie = true;
		this.mana = 1;
		setHeros(heros);
		listeCarteDuJoueurMain = new ArrayList<>();
		listeCarteEnJeux = new ArrayList<>();
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
		if(heros == "Mage"){
			this.heros = new HerosMage();
		} else if(heros == "Guerrier"){
			this.heros = new HerosGuerrier();
		} else if(heros == "Paladin"){
			this.heros = new HerosPaladin();
		}
		System.out.println(getHeros());
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
		Joueur j1 = this;
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
	
	public void initialiseMain(int rand){
		int pdM = getMana();
		if(rand == 1){
			//methode de test
			addCardMain();
			addCardMain();
			addCardMain();
			setMana(pdM+1);
			//verif carte en main
			System.out.println("Carte en main de "+getName());
			//verif mana
			System.out.println("Mana : " + getMana());
			//verif vie
			System.out.println("Vie : " + getHeros().getLife());
		}
		else if(rand == 2){
			addCardMain();
			addCardMain();
			addCardMain();
			addCardMain();
			System.out.println("Carte en main de "+getName());
			System.out.println("Mana : " + getMana());
			System.out.println("Vie : " + getHeros().getLife());
		}
	}
	
	public void addCardMain(){
		FactoryCard carteAjout = tirageCarte();
		System.out.println(carteAjout.toString() + " a ete ajoute a votre main !");
		listeCarteDuJoueurMain.add(carteAjout);
	}
	
	public void addCardJeu(){
		int NumeroDeLaCarteDansLaMain = 1;
		FactoryCard carteAJouer = listeCarteDuJoueurMain.get(NumeroDeLaCarteDansLaMain);
		listeCarteEnJeux.add(carteAJouer);
	}

	public void afficherCardMain(){
		for(FactoryCard c : listeCarteDuJoueurMain){
			System.out.println("|" +listeCarteDuJoueurMain.indexOf(c) + "|" + c.toString() /*Faire les toString des cartes (en gros ajouter leur nom)*/);
		}
			
	}
	
	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}
}
