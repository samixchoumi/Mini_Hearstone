package card.effect;

import card.FactoryCard;
import card.commune.CardServiteurZeroDeux;
import mecanique.Joueur;

/**
 * Created by E178220S on 10/01/18.
 */
public class EffectMaitriseDuBlocage extends EffectDecorator{
    private String name;
    private String effect;

    public EffectMaitriseDuBlocage(FactoryCard fc) {
        this.fc = fc;
        this.name = "Maitrise du blocage";
        this.effect = "+5 d armure et place une carte aleatoire de la pioche dans votre main";
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public String getEffect() {
        // TODO Auto-generated method stub
        return fc.getEffect()+ " Maitrise du blocage | " +this.effect;
    }

    @Override
    public void useEffect() {
    	getJoueur().getHeros().setLife(getJoueur().getHeros().getLife() + 5);
    	getJoueur().tirageCarte();
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
	public void setMana(int mana) {fc.setMana(mana);}

	@Override
	public Joueur getJoueur() {return fc.getJoueur();}

	@Override
	public void setJoueur(Joueur j) {fc.setJoueur(j);}
	
	@Override
	public Joueur getJoueurAdv() {return fc.getJoueurAdv();}

	@Override
	public void setJoueurAdv(Joueur jAdv) {fc.setJoueurAdv(jAdv);}

}
