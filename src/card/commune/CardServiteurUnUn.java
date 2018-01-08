package card.commune;

import card.FactoryCard;

public class CardServiteurUnUn extends FactoryCard{

	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void setAttaque(int atk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void setLife(int hp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 0;
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

}
