package card.paladin;

import card.FactoryCard;

public class CardChampionFrisselame extends FactoryCard {
	
//	public CardChampionFrisselame() {
//		effect1 = new EffectCharge();
//		effect2 = new EffectVolDeVie();
//	}
	
	
	private int attaque;
	private int life;
	private int mana;

	public CardChampionFrisselame() {
		this.attaque = 3;
		this.life = 2;
		this.mana = 4;
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
