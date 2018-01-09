package hero;

import mecanique.Joueur;
import power.Power;

public class HerosGuerrier extends Heros {

	private int life;
	private Joueur joueurAdv;
	
	public HerosGuerrier(Joueur joueurAdv){
		this.joueurAdv = joueurAdv;
		this.life = 30;
	}
	
	@Override
	public int getLife() {return life;}

	@Override
	public void setLife(int life) {this.life = life;}

	@Override
	public String typeHero() {return "Guerrier";}

	@Override
	public String getPower() {
		// TODO Auto-generated method stub
		return "Pouvoir :";
	}
	
	public String toString(){return typeHero();}

	@Override
	public Joueur getJoueurAdversaire() {
		return joueurAdv;
	}

}
