package card.mage;

import card.Card;
import card.effect.Effect;

public class CardMétamorphose implements Card {

	Effect effect;
	
//	public CardMétamorphose() {
//		effect = new Effect(); //transforme un serviteur en serviteur 1/1 sans effet spécial
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

}
