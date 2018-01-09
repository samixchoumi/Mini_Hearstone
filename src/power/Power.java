package power;

import hero.Heros;

public abstract class Power extends Heros{
	protected Heros heros;
	public abstract String getName();
	public abstract String getPower();
	public abstract void usePower();
	public abstract String toString();
}
