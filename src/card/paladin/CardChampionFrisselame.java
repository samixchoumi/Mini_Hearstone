package card.paladin;

import card.FactoryCard;

public class CardChampionFrisselame extends FactoryCard {
	
//	public CardChampionFrisselame() {
//		effect1 = new EffectCharge();
//		effect2 = new EffectVolDeVie();
//	}
	
	
	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 2;
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
