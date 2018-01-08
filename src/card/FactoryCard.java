package card;

public abstract class FactoryCard{
	public abstract int getAttaque();
	public abstract void setAttaque(int atk);
	public abstract int getLife();
	public abstract void setLife(int hp);
	public abstract int getMana();
	public abstract String getEffect();
	public abstract boolean canAttaque();
	public abstract boolean canBeAttaque();
}
