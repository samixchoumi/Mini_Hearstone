package card.guerrier;

import card.Card;
import card.effect.Effect;

public class CardTourbillon implements Card {

	Effect effect;
	
//	public CardTourbillon() {
//		effect1 = new Effect(); //inflige 1 points de d�g�ts � TOUS les serviteurs (y compris les v�tres).
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
