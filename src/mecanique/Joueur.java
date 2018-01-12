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
/**
 * Classe contenant toutes les informations lié au joueur
 * Vie / Mana / Nom / Heros / Etat(en jeu ou non) / carte en main
 * carte en jeu / cible choisi a attaquer
 * @author Samix-PC
 *
 */
public class Joueur {
	private Joueur joueurAdv;
	private String name;
	private boolean enVie;
	private int mana;
	private Heros heros;
	private Etat etat;
	private ArrayList<FactoryCard> listeCarteDuJoueurMain;
	private ArrayList<FactoryCard> listeCarteEnJeux;
	private int valChoisi; //index de la carte ciblï¿½ pour un pouvoir/effet

	/**
	 * Constructeur du joueur
	 * @param name du joueur
	 * @param heros du joueur
	 * @param joueurAdv le joueur adversaire
	 */
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
	
	/**
	 * Constructeur du joueur sans les autres informations
	 * (pour prendre en compte la creation du second joueur)
	 * @param name du joueur
	 */
	public Joueur(String name) {
		this.joueurAdv = null;
		this.name = name;
		this.enVie = true;
		this.mana = 1;
		listeCarteDuJoueurMain = new ArrayList<>();
		listeCarteEnJeux = new ArrayList<>();
	}
	
	/**
	 * @return la liste des cartes en mains du joueur
	 */
	public ArrayList<FactoryCard> getListeCarteDuJoueurMain() {return listeCarteDuJoueurMain;}

	/**
	 * Mais a jour la liste des cartes du joueur
	 * @param listeCarteDuJoueurMain
	 */
	public void setListeCarteDuJoueurMain(ArrayList<FactoryCard> listeCarteDuJoueurMain) {this.listeCarteDuJoueurMain = listeCarteDuJoueurMain;}
	
	/**
	 * Supprime une carte en main lorsqu'elle est posé sur le board
	 * @param card étant la carte choisi
	 */
	public void deleteCardMain(FactoryCard card){
		for (FactoryCard c : listeCarteDuJoueurMain){
			System.out.println(c + "  \n  " + card + c == card +"\n");
			if (c == card){
				listeCarteDuJoueurMain.remove(c);
			}
		}
	}

	/**
	 * @return la liste des cartes en jeux
	 */
	public ArrayList<FactoryCard> getListeCarteEnJeux() {return listeCarteEnJeux;}

	/**
	 * Met a jour la liste des cartes en jeux
	 * @param listeCarteEnJeux étant la liste des cartes en jeux a mettre a jour
	 */
	public void setListeCarteEnJeux(ArrayList<FactoryCard> listeCarteEnJeux) {this.listeCarteEnJeux = listeCarteEnJeux;}
	
	/**
	 * @return le joueur adverse
	 */
	public Joueur getJoueurAdv() {return joueurAdv;}

	/**
	 * Met a jour le joueur adverse
	 * @param joueurAdv etant le joueur adverse a modifier
	 */
	public void setJoueurAdv(Joueur joueurAdv) {this.joueurAdv = joueurAdv;}
	
	/**
	 * @return si le joueur est en vie
	 */
	public boolean isEnVie() {return enVie;}

	/**
	 * Met a jour le fais que le joueur est vivant ou non
	 * @param enVie etant la vie du joueur a changer
	 */
	public void setEnVie(boolean enVie) {this.enVie = enVie;}

	/**
	 * @return le heros du joueur
	 */
	public Heros getHeros() {return heros;}

	/**
	 * Met a jour le heros du joueur
	 * @param heros etant le heros a mettre en place
	 */
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

	/**
	 * @return le nom du joueur
	 */
	public String getName() {return name;}

	/**
	 * Met a jour le nom du joueur
	 * @param name etant le nouveau nom a modifier
	 */
	public void setName(String name) {this.name = name;}

	/**
	 * @return le nombre de point de mana du joueur
	 */
	public int getMana() {return mana;}

	/**
	 * Met a jour le mana du joueur
	 * @param mana etant la nouvelle valeur du mana
	 */
	public void setMana(int mana) {this.mana = mana;}
	
	/**
	 * @return l'etat du joueur
	 */
	public Etat getEtat() {return etat;}

	/**
	 * Met a jour l'etat du joueur
	 * @param etat etant le nouvelle etat du joueur
	 */
	public void setEtat(Etat etat) {this.etat = etat;}

	/**
	 * @return la valeur de la cible choisi par le joueur
	 */
	public int getValChoisi() {return this.valChoisi;}
	
	/**
	 * Met a jour la valeur choisi par l'utilisateur
	 * @param valChoisi etant la valeur choisi a mettre a jour
	 */
	public void setValChoisi(int valChoisi){this.valChoisi = valChoisi;}
	
	/**
	 * Tire aléatoirement une carte a mettre en main en fonction du type de héros choisi
	 * @return la nouvelle carte a ajouté a la main
	 */
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
	
	/**
	 * Methode permattant d'initialiser la main du joueur en debut de partie
	 * @param rand etant la valeur aleatoire a prendre en compte pour savoir qui commence et qui a le point
	 * de mana supplementaire
	 */
	public void initialiseMain(int rand){
		int pdM = getMana();
		if(rand == 1){
			//methode de test
			addCardMain();
			addCardMain();
			addCardMain();
			setMana(pdM+1);
		}
		else if(rand == 2){
			addCardMain();
			addCardMain();
			addCardMain();
		}
	}
	
	/**
	 * Ajoute une carte a la main du joueur
	 */
	public void addCardMain(){
		FactoryCard carteAjout = tirageCarte();
		System.out.println(carteAjout.toString() + " a ete ajoute a votre main !");
		listeCarteDuJoueurMain.add(carteAjout);
	}
	
	/**
	 * Ajoute une carte au jeu du joueur
	 */
	public void addCardJeu(){
		int NumeroDeLaCarteDansLaMain = 1;
		//TODO
		FactoryCard carteAJouer = listeCarteDuJoueurMain.get(NumeroDeLaCarteDansLaMain);
		listeCarteEnJeux.add(carteAJouer);
	}

	/**
	 * Affiche les cartes en mains du joueur
	 */
	public void afficherCardMain(){
		for(FactoryCard c : listeCarteDuJoueurMain){
			System.out.println("|" +listeCarteDuJoueurMain.indexOf(c) + "|" + c.toString() /*Faire les toString des cartes (en gros ajouter leur nom)*/);
		}
	}
	
	/**
	 * Affiche les cartes en jeu du joueur
	 */
	public void afficherCardJeu(){
		for(FactoryCard c : listeCarteEnJeux){
			System.out.println("|" +listeCarteEnJeux.indexOf(c) + "|" + c.toString() /*Faire les toString des cartes (en gros ajouter leur nom)*/);
		}
	}
	
	/**
	 * Affiche les infos essentiels du joueur (vie/mana/pseudo)
	 */
	public void afficherInfoJoueur(){
		System.out.println("Vie restante : " + heros.getLife());
		System.out.println("Mana         : " + getMana());
		System.out.println("A vous "+getName()+" !");
	}
}
