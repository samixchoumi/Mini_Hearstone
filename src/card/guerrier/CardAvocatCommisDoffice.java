package card.guerrier;

import card.Card;
import card.effect.Effect;

public class CardAvocatCommisDoffice implements Card {

	Effect effect;
	
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
	public Effect getEffect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canAttaque() {
		// TODO Auto-generated method stub
		return false;
	}

}
