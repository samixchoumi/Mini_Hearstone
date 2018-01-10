package card.effect;

import card.FactoryCard;
import mecanique.Joueur;

public class EffectVolDeVie extends EffectDecorator {
	private String name;
	private String effect;
	
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
		for(int i = 0;i < getJoueurAdv().getListeCarteEnJeux().size() ;i++){
			getJoueurAdv().getListeCarteEnJeux().get(getJoueurAdv().getValChoisi()).setLife(getJoueurAdv().getListeCarteEnJeux().get(getJoueurAdv().getValChoisi()).getLife() - getAttaque());
			if(getJoueur().getHeros().getLife() + getAttaque() > 30){
				getJoueur().getHeros().setLife(30);
			}else{
				getJoueur().getHeros().setLife(getJoueur().getHeros().getLife() + getAttaque());
			}
		}
	}
	
	public String toString() {
		return fc.toString() + "Cette carte possede un effet de "+this.getName();
	}
	
	@Override
	public int getAttaque() {return fc.getAttaque();}

	@Override
	public void setAttaque(int atk) {fc.setAttaque(atk);}

	@Override
	public int getLife() {return fc.getLife();}

	@Override
	public void setLife(int hp) {fc.setLife(hp);}

	@Override
	public int getMana() {return fc.getMana();}

	@Override
	public void setCanAttaque(boolean b) {fc.setCanAttaque(b);}

	@Override
	public boolean getCanAttaque() {return fc.getCanBeAttaque();}

	@Override
	public void setCanBeAttaque(boolean b) {fc.setCanBeAttaque(b);}

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