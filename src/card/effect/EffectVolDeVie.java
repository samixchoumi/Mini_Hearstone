package card.effect;

import card.Card;
import mecanique.Joueur;

public class EffectVolDeVie implements Effect {
	private String name;
	private String effect;
	private Card card;
	private Joueur joueurHeros;
	
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
		if(joueurHeros.getHeros().getLife() + card.getAttaque() > 30){
			joueurHeros.getHeros().setLife(30);
		}else{
			joueurHeros.getHeros().setLife(joueurHeros.getHeros().getLife() + card.getAttaque());
		}
	}
	
	public String toString() {
		return "Cette carte possede un effet de "+this.getName()+".\n"+
				this.effect;
	}
}