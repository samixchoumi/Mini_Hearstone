package hero;

import mecanique.Joueur;
import power.Power;
/**
 * Classe abstraite creant le heros du joueur
 * @author E145855N
 *
 */
public abstract class Heros {
	
	/**
	 * @return la vie du héros
	 */
	public abstract int getLife();
	
	/**
	 * Met a jour la vie du héros
	 * @param life etant la vie du héros mise a jour
	 */
	public abstract void setLife(int life);
	
	/**
	 * @return le type de héros (Mage|Paladin|Guerrier)
	 */
	public abstract String typeHero();
	
	/**
	 * @return le pouvoir du héros
	 */
	public abstract String getPower();
	
	/**
	 * @return le joueur jouant le héro
	 */
	public abstract Joueur getJoueur();
	
	/**
	 * @return le joueur adversaire ne jouant pas le héro
	 */
	public abstract Joueur getJoueurAdversaire();
	
}
