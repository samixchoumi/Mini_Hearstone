package card.guerrier;

import card.Card;
import card.effect.Effect;

public class CardMaitriseDuBlocage implements Card {

	
	Effect effect;
	
//	public CardMaitriseDuBlocage() {
//		effect1 = new Effect(); //+5 d’armure
//		effect2 = new Effect(); // place une carte aléatoire de la pioche dans votre main.
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
		return 3;
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
