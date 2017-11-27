package card.effect;

import card.Card;
import hero.Heros;
import mecanique.adversaire.Adversaire;

public class EffectVolDeVie implements Effect {
	private String name;
	private String effect;
	private Card card;
	private Heros heros;
	
	public EffectVolDeVie() {
		this.name = "Vol de vie";
		this.effect = "Vol " + card.getAttaque() + " point de vie";
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
	public void useEffect() {
		// TODO Auto-generated method stub
		if(heros.getLife() + card.getAttaque() > 30){
			heros.setLife(30);
		}else{
			heros.setLife(heros.getLife() + card.getAttaque());
		}
	}
	
	public String toString() {
		return "Cette carte possede un effet de "+this.getName()+".\n"+
				this.effect;
	}
}