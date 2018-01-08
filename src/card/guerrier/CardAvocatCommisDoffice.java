package card.guerrier;

import card.FactoryCard;

public class CardAvocatCommisDoffice extends FactoryCard {

	
//	public CardAvocatCommisDoffice() {
//		effect1 = new Effect(); //provocation
//	}
	
	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 7;
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
