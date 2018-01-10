package card.commune;

import card.FactoryCard;

public class CardChevaucheurDeLoup extends FactoryCard {

	private int attaque;
	private int life;
	private int mana;
	private boolean canAttaque;
	private boolean canBeAttaque;

	public CardChevaucheurDeLoup() {
		this.attaque      = 3;
		this.life         = 1;
		this.mana         = 3;
		this.canAttaque   = true; // EFFET CHARGE
		this.canBeAttaque = true;
	}

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
		return "Chevaucheur de loup | "+getAttaque()+" atk | "+getLife()+" hp | " +getMana()+" mana |";
	}
}
