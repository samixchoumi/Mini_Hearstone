package hero;

import mecanique.Joueur;
import power.Power;

public class HerosMage extends Heros {

	private int life;
	private Joueur joueurAdv;
	
	public HerosMage(Joueur joueurAdv){
		this.joueurAdv = joueurAdv;
		this.life = 30;
	}
	
	@Override
	public int getLife() {return life;}

	@Override
	public void setLife(int life) {this.life = life;}

	@Override
	public String typeHero() {return "Mage";}

	@Override
	public String getPower() {
		// TODO Auto-generated method stub
		return "Pouvoir :";
	}
	
	public String toString(){return typeHero();}

	@Override
	public Joueur getJoueurAdversaire() {
		// TODO Auto-generated method stub
		return joueurAdv;
	}
	
}
