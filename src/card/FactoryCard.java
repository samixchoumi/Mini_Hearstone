package card;

import mecanique.Joueur;

public abstract class FactoryCard{
	public abstract int getAttaque();
	public abstract void setAttaque(int atk);
	public abstract int getLife();
	public abstract void setLife(int hp);
	public abstract int getMana();
	public abstract void setMana(int mana);
	public abstract String getEffect();
	public abstract void setCanAttaque(boolean b);
	public abstract boolean getCanAttaque();
	public abstract void setCanBeAttaque(boolean b);
	public abstract boolean getCanBeAttaque();
	public abstract Joueur getJoueur();
	public abstract void setJoueur(Joueur j);
	public abstract Joueur getJoueurAdv();
	public abstract void setJoueurAdv(Joueur jAdv);
}
