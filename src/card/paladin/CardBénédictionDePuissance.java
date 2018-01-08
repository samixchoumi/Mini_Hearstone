package card.paladin;

import card.Card;
import card.effect.Effect;

public class CardBénédictionDePuissance implements Card {

	Effect effect;
	
//	public CardBénédictionDePuissance() {
//		effect1 = new Effect(); // confère +3 d’attaque à un serviteur
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

	@Override
	public boolean canBeAttaque() {
		// TODO Auto-generated method stub
		return false;
	}

}
