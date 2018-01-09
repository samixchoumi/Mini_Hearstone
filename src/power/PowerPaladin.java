package power;

import hero.Heros;
import mecanique.Joueur;
import power.Power;

public class PowerPaladin extends Power {
	
	private String name;
	private String effect;
	
	public PowerPaladin(Heros heros) {
		this.heros = heros;
		this.name = "Renfort";
		this.effect = "Invoquant un serviteur \"recrue de la Main d argent\" ."; //1/1
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
