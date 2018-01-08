package card.paladin;

import card.Card;
import card.effect.Effect;

public class CardConsecration implements Card {

	Effect effect;
	
//	public CardConsecration() {
//		effect1 = new Effect(); // inflige 2 points de dégâts à tous les adversaires
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
		return 4;
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
