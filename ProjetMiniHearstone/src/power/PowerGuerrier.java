package power;

import power.Power;

public class PowerGuerrier implements Power {
	
	private String name;
	private String effect;
	
	public PowerGuerrier() {
		this.name = "Armure";
		this.effect = "Confére 2 points d’armure.";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getEffect() {
		// TODO Auto-generated method stub
		return this.effect;
	}

	@Override
	public boolean usePower() {
		// TODO Auto-generated method stub
		
		return true; //Si pouvoir effectué
		
		//return false; // Si pouvoir pas effectué
	}
	
	public String toString(){
		return "Utilise sa capacité spécial : " + this.name + " !"+
				"\n" + this.effect;
	}
}
