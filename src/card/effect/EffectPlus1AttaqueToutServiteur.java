package card.effect;

import card.FactoryCard;
import card.commune.CardChefDeRaid;

public class EffectPlus1AttaqueToutServiteur extends EffectDecorator {
	private String name;
	private String effect;
	private CardChefDeRaid chefDeRaid;
	
	public EffectPlus1AttaqueToutServiteur(CardChefDeRaid chefDeRaid) {
		this.chefDeRaid = chefDeRaid;
		this.name = "Plus 1 d attaque";
		this.effect = "Plus 1 d attaque a tous les serviteurs alli�s sur le plateau (tant que ce serviteur est vivant)";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getEffect() {
		// TODO Auto-generated method stub
		return fc.getEffect()+" +1 d'attaque de tous les serviteurs ";
	}

	@Override
	public void useEffect() { //donne a tout les serviteurs 1 point d attaque en plus pendant que ce serviteur est en vie 
		// TODO Auto-generated method stub
		for(FactoryCard c : chefDeRaid.getJoueur().getListeCarteEnJeux()){
			int attack = c.getAttaque();
			c.setAttaque(attack+1);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
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
