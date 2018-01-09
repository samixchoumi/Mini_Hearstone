package card.effect;

import card.FactoryCard;
import mecanique.Joueur;

public class EffectVolDeVie extends EffectDecorator {
	private String name;
	private String effect;
	private Joueur joueurHeros;
	
	public EffectVolDeVie(FactoryCard fc) {
		this.fc = fc;
		this.name = "Vol de vie";
		this.effect = "Vol " + fc.getAttaque() + " point de vie";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getEffect() {
		// TODO Auto-generated method stub
		return fc.getEffect()+" Vol de vie ";
	}

	@Override
	public void useEffect() {
		// TODO Auto-generated method stub
		if(joueurHeros.getHeros().getLife() + fc.getAttaque() > 30){
			joueurHeros.getHeros().setLife(30);
		}else{
			joueurHeros.getHeros().setLife(joueurHeros.getHeros().getLife() + fc.getAttaque());
		}
	}
	
	public String toString() {
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