package card.mage;

import card.FactoryCard;

public class CardExplosionDesArcanes extends FactoryCard {
	
//	public CardExplosionDesArcanes() {
//		effect = new Effect(); // inflige 1 pt de degat a tout les serviteur adver
//	}
	
	private int attaque;
	private int life;
	private int mana;

	public CardExplosionDesArcanes() {
		this.attaque = 0;
		this.life = 0;
		this.mana = 2;
	}

	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return attaque;
	}
	
	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return life;
	}
	
	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return mana;
	}

	@Override
	public String getEffect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canAttaque() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canBeAttaque() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAttaque(int atk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLife(int hp) {
		// TODO Auto-generated method stub
		
	}

}
