package card;

import mecanique.Joueur;
/**
 * Classe abstraite utilisant le design pattern factory pour la creation
 * de carte
 * @author E145855N
 *
 */
public abstract class FactoryCard{
	
	/**
	 * @return l'attaque d'une carte
	 */
	public abstract int getAttaque();
	
	/**
	 * Met a jour l'attaque d'une carte
	 * @param atk étant la nouvelle valeur attribué à l'attaque
	 */
	public abstract void setAttaque(int atk);
	
	/**
	 * @return la vie d'une carte
	 */
	public abstract int getLife();
	
	/**
	 * Met a jour la vie d'une carte
	 * @param hp étant la nouvelle valeur attribué à la vie
	 */
	public abstract void setLife(int hp);
	
	/**
	 * @return le mana d'une carte
	 */
	public abstract int getMana();
	
	/**
	 * Met a jour le mana d'une carte
	 * @param mana étant la nouvelle valeur attribué au mana
	 */
	public abstract void setMana(int mana);
	
	/**
	 * @return l'effet d'une carte
	 */
	public abstract String getEffect();
	
	/**
	 * Met a jour si une carte peut attaquer ou non
	 * @param b étant la nouvelle valeur attribué a la carte si elle peut attaquer ou non
	 */
	public abstract void setCanAttaque(boolean b);
	
	/**
	 * @return si une carte peut attaquer ou non
	 */
	public abstract boolean getCanAttaque();
	
	/**
	 * Met a jour si une carte peut être attaquer ou non
	 * @param b étant la nouvelle valeur attribué a la carte si elle peut être attaquer ou non
	 */
	public abstract void setCanBeAttaque(boolean b);
	
	/**
	 * @return si une carte peut être attaquer ou non
	 */
	public abstract boolean getCanBeAttaque();
	
	/**
	 * @return le joueur de la carte
	 */
	public abstract Joueur getJoueur();
	
	/**
	 * Met a jour le joueur d'une carte
	 * @param j étant le nouveau joueur attribue a la carte
	 */
	public abstract void setJoueur(Joueur j);
	
	/**
	 * @return le joueur adversaire a la carte
	 */
	public abstract Joueur getJoueurAdv();
	
	/**
	 * Met a jour le joueur adverse d'une carte
	 * @param jAdv étant le nouveau joueur adverse attribue a la carte
	 */
	public abstract void setJoueurAdv(Joueur jAdv);
}
