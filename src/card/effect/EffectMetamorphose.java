package card.effect;

import card.FactoryCard;

public class EffectMetamorphose extends EffectDecorator{
	private String name;
	private String effect;
	
	public EffectMetamorphose(FactoryCard fc) {
		this.fc = fc;
		this.name = "Metamorphose";
		this.effect = "Transforme un serviteur en serviteur 1/1 sans effet spécial";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getEffect() {
		// TODO Auto-generated method stub
		return fc.getEffect()+" Metamorphose ";
	}

	@Override
	public void useEffect() { 
		// TODO Auto-generated method stub
	}
	
	public String toString() {
		return fc.toString() + "Cette carte possede un effet de "+this.getName();
	}

	@Override
	public int getAttaque() {return fc.getAttaque();}

	@Override
	public void setAttaque(int atk) {}

	@Override
	public int getLife() {return fc.getLife();}

	@Override
	public void setLife(int hp) {}

	@Override
	public int getMana() {return fc.getMana();}

	@Override
	public void setCanAttaque(boolean b) {}

	@Override
	public boolean getCanAttaque() {return fc.getCanBeAttaque();}

	@Override
	public void setCanBeAttaque(boolean b) {}

	@Override
	public boolean getCanBeAttaque() {return fc.getCanBeAttaque();}
	
	@Override
	public void setMana(int mana) {}
}
