package power;

import hero.Heros;
import mecanique.Joueur;
import power.Power;

public class PowerGuerrier extends Power {
	
	private String name;
	private String effect;
	
	public PowerGuerrier(Heros heros) {
		this.heros = heros;
		this.name = "Armure";
		this.effect = "Confere 2 points d armure.";
	}

	public String getName() {return this.name;}
	public String getPower() {return heros.getPower() + this.getName();}

	public void usePower() {
		// TODO Auto-generated method stub
		System.out.println("Utilise sa capacite special : " + this.name + " !"+
				"\n" + this.effect);
	}
	
	public String toString(){return heros.toString();}

	@Override
	public int getLife() {return heros.getLife();}

	@Override
	public void setLife(int life) {}

	@Override
	public String typeHero() {return heros.typeHero();}
	
	@Override
	public Joueur getJoueurAdversaire() {return heros.getJoueurAdversaire();}
}
