package hero;

import mecanique.Joueur;
import power.Power;

public abstract class Heros {
	public abstract int getLife();
	public abstract void setLife(int life);
	public abstract String typeHero();
	public abstract String getPower();
	public abstract Joueur getJoueurAdversaire();
}
