package card.paladin;

import card.Card;
import card.effect.Effect;

public class CardChampionFrisselame implements Card {

	Effect effect;
	
//	public CardChampionFrisselame() {
//		effect1 = new EffectCharge();
//		effect2 = new EffectVolDeVie();
//	}
	
	
	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 4;
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
		// TODO Auto-generated method stub
		return false;
	}

}
