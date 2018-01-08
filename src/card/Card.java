package card;

import card.effect.Effect;

public interface Card{
	int getAttaque();
	int getLife();
	int getMana();
	Effect getEffect();
	boolean canAttaque();
	boolean canBeAttaque();
}
