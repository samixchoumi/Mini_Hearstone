package card.effect;

import card.FactoryCard;
import mecanique.Joueur;

public class EffectPlus1AttaqueToutServiteurAllie extends EffectDecorator {
	private String name;
	private String effect;
	
	public EffectPlus1AttaqueToutServiteurAllie(FactoryCard fc) {
		this.fc = fc;
		this.name = "Plus 1 d attaque";
		this.effect = "Plus 1 d attaque a tous les serviteurs allies sur le plateau (tant que ce serviteur est vivant)";
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getEffect() {return fc.getEffect()+" | " +this.effect;}

	@Override
	public void useEffect() {
		for(FactoryCard c : getJoueur().getListeCarteEnJeux()){
			int attack = c.getAttaque();
			c.setAttaque(attack+1);
		}
		//TODO VERIFIER LEFFET TANT QUE SERVITEUR VIVANT
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fc.toString() + "Cette carte possede un effet de "+this.getEffect() + " |";
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
