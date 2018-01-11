package hero;

import mecanique.Joueur;
import power.Power;

public class HerosPaladin extends Heros {

	private int life;
	private Joueur joueurAdv;
	private Joueur joueur;
	
	public HerosPaladin(Joueur jAdv, Joueur j){
		this.joueur = j;
		this.joueurAdv = jAdv;
		this.life = 30;
	}
	
	@Override
	public int getLife() {return life;}

	@Override
	public void setLife(int life) {this.life = life;}

	@Override
	public String typeHero() {return "Paladin";}

	@Override
	public String getPower() {
		// TODO Auto-generated method stub
		return "Power :";
	}
	
	public String toString(){return typeHero();}

	@Override
	public Joueur getJoueurAdversaire() {return joueurAdv;}

	@Override
	public Joueur getJoueur() {return joueur;}
}
