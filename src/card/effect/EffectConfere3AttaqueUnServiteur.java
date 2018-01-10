package card.effect;

import card.FactoryCard;

public class EffectConfere3AttaqueUnServiteur extends EffectDecorator {
	private String name;
    private String effect;

    public EffectConfere3AttaqueUnServiteur(FactoryCard fc) {
        this.fc = fc;
        this.name = "Benediction de puissance";
        this.effect = "Conf�re +3 d�attaque � un serviteur";
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public String getEffect() {
        // TODO Auto-generated method stub
        return fc.getEffect()+" Benediction de puissance";
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
	public void setMana(int mana) {
		// TODO Auto-generated method stub
		
	}
}
