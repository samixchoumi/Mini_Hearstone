package card.commune;

import card.Card;
import card.effect.Effect;

public class CardChefDeRaid implements Card {

	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 3;
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
	public Effect getEffect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canAttaque() {
		return false;
	}
}