package card.effect;

import card.FactoryCard;

/**
 * Created by E178220S on 10/01/18.
 */
public class EffectInfligeDegatAdversaire extends EffectDecorator {
    private String name;
    private String effect;

    public EffectInfligeDegatAdversaire(FactoryCard fc) {
        this.fc = fc;
        this.name = "ExplosionDesArcanes";
        this.effect = "Inflige 1 point de degats a  tous les serviteurs adverses";
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public String getEffect() {
        // TODO Auto-generated method stub
        return fc.getEffect()+" Explosion Des Arcanes ";
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
