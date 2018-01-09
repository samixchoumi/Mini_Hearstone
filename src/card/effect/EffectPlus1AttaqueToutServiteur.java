package card.effect;

import card.FactoryCard;
import mecanique.Joueur;

public class EffectPlus1AttaqueToutServiteur extends EffectDecorator {
	private String name;
	private String effect;
	private Joueur j;
	
	public EffectPlus1AttaqueToutServiteur(FactoryCard fc) {
		this.fc = fc;
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
		for(FactoryCard c : j.getListeCarteEnJeux()){
			int attack = c.getAttaque();
			c.setAttaque(attack++);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fc.toString() + "Cette carte possede un effet de "+this.getName();
	}

	@Override
	public int getAttaque() {return 0;}

	@Override
	public void setAttaque(int atk) {}

	@Override
	public int getLife() {return 0;}

	@Override
	public void setLife(int hp) {}

	@Override
	public int getMana() {return 0;}

	@Override
	public void setCanAttaque(boolean b) {}

	@Override
	public boolean getCanAttaque() {return false;}

	@Override
	public void setCanBeAttaque(boolean b) {}

	@Override
	public boolean getCanBeAttaque() {return false;}
}
