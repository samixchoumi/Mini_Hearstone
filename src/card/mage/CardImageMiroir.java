package card.mage;

import card.Card;
import card.effect.Effect;

public class CardImageMiroir implements Card {

	
	Effect effect;
	
//	public CardImageMiroir() {
//		effect = new Effect(); //invoque deux serviteur 0/2 provocation
//	}
	
	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return 0;
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

}
