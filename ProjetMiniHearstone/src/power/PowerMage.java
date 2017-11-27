package power;

import mecanique.adversaire.Adversaire;
import power.Power;

public class PowerMage implements Power {
	
	private String name;
	private String effect;
	private Adversaire adversaire;
	
	public PowerMage() {
		this.name = "Boule de feu";
		this.effect = "Inflige un point de dégât à "+this.adversaire.getName();
			
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
	public void usePower() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		adversaire.setLife(adversaire.getLife() - 1);
	}

	public String toString(){
		return "Utilise sa capacité spécial : " + this.name + " !"+
				"\n" + this.effect;
	}
}
