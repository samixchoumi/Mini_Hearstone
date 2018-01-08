package card.guerrier;

import card.FactoryCard;

public class CardMaitriseDuBlocage extends FactoryCard  {
	
//	public CardMaitriseDuBlocage() {
//		effect1 = new Effect(); //+5 d’armure
//		effect2 = new Effect(); // place une carte aléatoire de la pioche dans votre main.
//      carte sort : elle disparait juste après utilisation sur le jeu
//	}
	
	private int attaque;
	private int life;
	private int mana;

	public CardMaitriseDuBlocage() {
		this.attaque = 0;
		this.life = 0;
		this.mana = 3;
	}

	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return attaque;
	}
	
	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return life;
	}
	
	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return mana;
	}

	@Override
	public String getEffect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canAttaque() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canBeAttaque() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAttaque(int atk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLife(int hp) {
		// TODO Auto-generated method stub
		
	}

}
