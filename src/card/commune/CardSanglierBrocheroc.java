package card.commune;

import card.Card;
import card.effect.Effect;

public class CardSanglierBrocheroc implements Card {
	
	Effect effect;
	
//	public CardSanglierBrocheroc() {
//		effect = new EffectCharge();
//	}
	
	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 1;
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

	@Override
	public boolean canBeAttaque() {
		// TODO Auto-generated method stub
		return false;
	}

}
