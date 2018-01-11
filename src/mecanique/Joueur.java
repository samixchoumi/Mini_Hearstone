package mecanique;

import java.util.ArrayList;

import card.FactoryCard;
import card.commune.CardChefDeRaid;
import card.commune.CardChevaucheurDeLoup;
import card.commune.CardSanglierBrocheroc;
import card.commune.CardSoldatDuComteDeLor;
import card.commune.CardYetiNoroit;
import card.effect.Effect1DegatTOUSServiteur;
import card.effect.EffectCharge;
import card.effect.EffectConfere3AttaqueUnServiteur;
import card.effect.EffectInflige2DegatTousAdv;
import card.effect.EffectInfligeDegatAdversaire;
import card.effect.EffectInvoqueDeuxServiteurs;
import card.effect.EffectMaitriseDuBlocage;
import card.effect.EffectMetamorphose;
import card.effect.EffectPlus1AttaqueToutServiteurAllie;
import card.effect.EffectProvocation;
import card.effect.EffectVolDeVie;
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
import power.PowerGuerrier;
import power.PowerMage;
import power.PowerPaladin;

public class Joueur {
	private Joueur joueurAdv;
	private String name;
	private boolean enVie;
	private int mana;
	private Heros heros;
	private Etat etat;
	private ArrayList<FactoryCard> listeCarteDuJoueurMain;
	private ArrayList<FactoryCard> listeCarteEnJeux;
	private int valChoisi; //index de la carte cibl� pour un pouvoir/effet

	public Joueur(String name, String heros, Joueur joueurAdv) {
		this.joueurAdv = joueurAdv;
		this.name = name;
		this.enVie = true;
		this.mana = 1;
		setHeros(heros);
		listeCarteDuJoueurMain = new ArrayList<>();
		listeCarteEnJeux = new ArrayList<>();
		this.valChoisi = 0;
	}
	
	public Joueur(String name) {
		this.joueurAdv = null;
		this.name = name;
		this.enVie = true;
		this.mana = 1;
		listeCarteDuJoueurMain = new ArrayList<>();
		listeCarteEnJeux = new ArrayList<>();
	}
	
	public ArrayList<FactoryCard> getListeCarteDuJoueurMain() {return listeCarteDuJoueurMain;}

	public void setListeCarteDuJoueurMain(ArrayList<FactoryCard> listeCarteDuJoueurMain) {this.listeCarteDuJoueurMain = listeCarteDuJoueurMain;}

	public ArrayList<FactoryCard> getListeCarteEnJeux() {return listeCarteEnJeux;}

	public void setListeCarteEnJeux(ArrayList<FactoryCard> listeCarteEnJeux) {this.listeCarteEnJeux = listeCarteEnJeux;}
	
	public Joueur getJoueurAdv() {return joueurAdv;}

	public void setJoueurAdv(Joueur joueurAdv) {this.joueurAdv = joueurAdv;}
	
	public boolean isEnVie() {return enVie;}

	public void setEnVie(boolean enVie) {this.enVie = enVie;}

	public Heros getHeros() {return heros;}

	public void setHeros(String heros) {
		if(heros.equalsIgnoreCase("Mage")){
			this.heros = new HerosMage(joueurAdv, this);
			this.heros = new PowerMage(this.heros);
		} else if(heros.equalsIgnoreCase("Guerrier")){
			this.heros = new HerosGuerrier(joueurAdv, this);
			this.heros = new PowerGuerrier(this.heros);
		} else if(heros.equalsIgnoreCase("Paladin")){
			this.heros = new HerosPaladin(joueurAdv, this);
			this.heros = new PowerPaladin(this.heros);
		}
		System.out.println("Heros choisi +>" + getHeros());
		System.out.println("Pouvoir du hero +>" +getHeros().getPower());
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public int getMana() {return mana;}

	public void setMana(int mana) {this.mana = mana;}
	
	public Etat getEtat() {return etat;}

	public void setEtat(Etat etat) {this.etat = etat;}

	public int getValChoisi() {return 0;}
	
	public void setValChoisi(int valChoisi){this.valChoisi = valChoisi;}
	
	public FactoryCard tirageCarte(){
		int lower = 1 , higher = 9;
		int random = (int)(Math.random()*(higher-lower)) + lower;
		
		FactoryCard fc = null;
		Joueur j1 = this;
		if(j1.getHeros().typeHero() == "Mage"){
			switch (random) {
				case 1: fc = new CardChefDeRaid(this, joueurAdv);
						fc = new EffectPlus1AttaqueToutServiteurAllie(fc);
				return fc;
				case 2: fc = new CardChevaucheurDeLoup(this, joueurAdv);
						fc = new EffectCharge(fc);
				return fc;
				case 3: fc = new CardSanglierBrocheroc(this, joueurAdv);
				return fc;
				case 4: fc = new CardSoldatDuComteDeLor(this, joueurAdv);
				        fc = new EffectProvocation(fc);
				return fc;
				case 5: fc = new CardYetiNoroit(this, joueurAdv);
				return fc;
				case 6: fc = new CardExplosionDesArcanes(this, joueurAdv);
						fc = new EffectInfligeDegatAdversaire(fc);
				return fc;
				case 7: fc = new CardImageMiroir(this, joueurAdv);
						fc = new EffectInvoqueDeuxServiteurs(fc);
				return fc;
				case 8: fc = new CardMetamorphose(this, joueurAdv);
						fc = new EffectMetamorphose(fc);
				return fc;
			}
		} else if(j1.getHeros().typeHero() == "Guerrier"){
			switch (random) {
				case 1: fc = new CardChefDeRaid(this, joueurAdv);
						fc = new EffectPlus1AttaqueToutServiteurAllie(fc);
				return fc;
				case 2: fc = new CardChevaucheurDeLoup(this, joueurAdv);
						fc = new EffectCharge(fc);
				return fc;
				case 3: fc = new CardSanglierBrocheroc(this, joueurAdv);
				return fc;
				case 4: fc = new CardSoldatDuComteDeLor(this, joueurAdv);
				        fc = new EffectProvocation(fc);
				return fc;
				case 5: fc = new CardYetiNoroit(this, joueurAdv);
				return fc;
				case 6: fc = new CardAvocatCommisDoffice(this, joueurAdv);
						fc = new EffectProvocation(fc);
				return fc;
				case 7: fc = new CardMaitriseDuBlocage(this, joueurAdv);
						fc = new EffectMaitriseDuBlocage(fc);
				return fc;
				case 8: fc = new CardTourbillon(this, joueurAdv);
						fc = new Effect1DegatTOUSServiteur(fc);
				return fc;
			}
		} else if(j1.getHeros().typeHero() == "Paladin"){
			switch (random) {
				case 1: fc = new CardChefDeRaid(this, joueurAdv);
						fc = new EffectPlus1AttaqueToutServiteurAllie(fc);
				return fc;
				case 2: fc = new CardChevaucheurDeLoup(this, joueurAdv);
						fc = new EffectCharge(fc);
				return fc;
				case 3: fc = new CardSanglierBrocheroc(this, joueurAdv);
				return fc;
				case 4: fc = new CardSoldatDuComteDeLor(this, joueurAdv);
				        fc = new EffectProvocation(fc);
				return fc;
				case 5: fc = new CardYetiNoroit(this, joueurAdv);
				return fc;
				case 6: fc = new CardBenedictionDePuissance(this, joueurAdv);
						fc = new EffectConfere3AttaqueUnServiteur(fc);
				return fc;
				case 7: fc = new CardChampionFrisselame(this, joueurAdv);
						fc = new EffectCharge(fc);
						fc = new EffectVolDeVie(fc);
				return fc;
				case 8: fc = new CardConsecration(this, joueurAdv);
						fc = new EffectInflige2DegatTousAdv(fc);
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
	
	public void afficherCardJeu(){
		for(FactoryCard c : listeCarteEnJeux){
			System.out.println("|" +listeCarteEnJeux.indexOf(c) + "|" + c.toString() /*Faire les toString des cartes (en gros ajouter leur nom)*/);
		}
	}
	
	public void afficherInfoJoueur(){
		System.out.println("Vie restante : " + heros.getLife());
		System.out.println("Mana         : " + getMana());
		System.out.println("A vous "+getName()+" !");
	}
}
