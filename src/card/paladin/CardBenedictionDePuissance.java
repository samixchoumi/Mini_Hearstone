package card.paladin;

import card.FactoryCard;

public class CardBenedictionDePuissance extends FactoryCard{
	
	private int attaque;
	private int life;
	private int mana;
	private boolean canAttaque;
	private boolean canBeAttaque;

	public CardBenedictionDePuissance() {
		this.attaque      = 0; //Sort
		this.life         = 0; //Sort
		this.mana         = 1;
		this.canAttaque   = false; //Sort
		this.canBeAttaque = false; //Sort
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
	
	public String toString(){
		return "Benediction de puissance | " +getMana()+"mana | "+" Sort |" ;
	}
}
