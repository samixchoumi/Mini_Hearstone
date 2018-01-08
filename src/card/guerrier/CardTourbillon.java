package card.guerrier;

import card.FactoryCard;

public class CardTourbillon extends FactoryCard  {
	
//	public CardTourbillon() {
//		effect1 = new Effect(); //inflige 1 points de dégâts à TOUS les serviteurs (y compris les vôtres).
//	}
	
	private int attaque;
	private int life;
	private int mana;

	public CardTourbillon() {
		this.attaque = 0;
		this.life = 0;
		this.mana = 1;
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
