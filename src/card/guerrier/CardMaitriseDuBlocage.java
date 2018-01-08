package card.guerrier;

import card.FactoryCard;

public class CardMaitriseDuBlocage extends FactoryCard  {
	
//	public CardMaitriseDuBlocage() {
//		effect1 = new Effect(); //+5 d’armure
//		effect2 = new Effect(); // place une carte aléatoire de la pioche dans votre main.
//	}
	
	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 3;
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
