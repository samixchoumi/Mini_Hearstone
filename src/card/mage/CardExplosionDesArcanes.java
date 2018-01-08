package card.mage;

import card.Card;
import card.effect.Effect;

public class CardExplosionDesArcanes implements Card {

	Effect effect;
	
//	public CardExplosionDesArcanes() {
//		effect = new Effect(); // inflige 1 pt de degat a tout les serviteur adver
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
		return 2;
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
