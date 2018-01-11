package card.effect;

import card.FactoryCard;
import mecanique.Joueur;

public class EffectProvocation extends EffectDecorator {
	private String name;
	private String effect;
	
	public EffectProvocation(FactoryCard fc) {
		this.fc = fc;
		this.name = "Provocation";
		this.effect = "Cible prioritaire";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getEffect() {
		// TODO Auto-generated method stub
		return fc.getEffect()+" Provocation | " +this.effect;
	}

	@Override
	public void useEffect() {
		System.out.println(effect);
		
		getJoueur().getHeros().setCanBeAttaque(false);
		
		for(FactoryCard c : getJoueur().getListeCarteEnJeux()){
			if(c.getEffect().contains(getName())){
				setCanBeAttaque(true);
			}else{
				setCanBeAttaque(false);
			}
		}
	}
	
	public String toString() {
		return fc.toString() + " Cette carte possede un "+this.getEffect() + " |";
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
