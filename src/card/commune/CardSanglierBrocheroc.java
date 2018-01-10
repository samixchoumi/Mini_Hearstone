package card.commune;

import card.FactoryCard;
import mecanique.Joueur;

public class CardSanglierBrocheroc extends FactoryCard {
	
	private int attaque;
	private int life;
	private int mana;
	private boolean canAttaque;
	private boolean canBeAttaque;
	private Joueur j;
	private Joueur jAdv;

	public CardSanglierBrocheroc(Joueur j, Joueur jAdv) {
		this.j            = j;
		this.jAdv         = jAdv;
		this.attaque      = 1;
		this.life         = 1;
		this.mana         = 1;
		this.canAttaque   = false;
		this.canBeAttaque = true;
	}

	@Override
	public Joueur getJoueurAdv() {return jAdv;}

	@Override
	public void setJoueurAdv(Joueur jAdv) {this.jAdv = jAdv;}
	
	@Override
	public Joueur getJoueur() {return j;}

	@Override
	public void setJoueur(Joueur j) {this.j = j;}
	
	@Override
	public int getAttaque() {return attaque;}
	
	@Override
	public int getLife() {return life;}
	
	@Override
	public int getMana() {return mana;}

	@Override
	public String getEffect() {return "Effet : ";}
	
	@Override
	public void setAttaque(int atk) {this.attaque = atk;}

	@Override
	public void setLife(int hp) {this.life = hp;}

	@Override
	public void setCanAttaque(boolean b) {this.canAttaque = b;}

	@Override
	public boolean getCanAttaque() {return canAttaque;}

	@Override
	public void setCanBeAttaque(boolean b) {this.canBeAttaque = b;}

	@Override
	public boolean getCanBeAttaque() {return canBeAttaque;}
	
	@Override
	public void setMana(int mana) {this.mana = mana;}
	
	public String toString(){
		return "Sanglier Brocheroc | "+getAttaque()+" atk | "+getLife()+" hp | " +getMana()+" mana |";
	}
}
