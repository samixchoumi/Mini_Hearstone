package card.commune;

import card.FactoryCard;

public class CardChefDeRaid extends FactoryCard {

	@Override
	public int getAttaque() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getEffect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canAttaque() {
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
