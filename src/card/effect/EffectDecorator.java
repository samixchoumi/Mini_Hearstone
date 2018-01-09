package card.effect;

import card.FactoryCard;

public abstract class EffectDecorator extends FactoryCard{
	protected FactoryCard fc;
	public abstract String getName();
	public abstract String getEffect();
	public abstract void useEffect();
	public abstract String toString();
}
