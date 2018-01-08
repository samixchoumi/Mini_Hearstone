package mecanique;

import hero.*;

public class Joueur {
	private String name;
	private boolean enVie;
	private int mana;
	private Heros heros;

	
	
	public Joueur(String name, String heros) {
		super();
		this.name = name;
		this.enVie = true;
		this.mana = 1;
		this.heros = null;
		setHeros(heros);
	}

	public boolean isEnVie() {
		return enVie;
	}

	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}

	public Heros getHeros() {
		return heros;
	}

	public void setHeros(String heros) {
		if(heros != null){
			System.out.println("Heros deja attribue");
		} else if(heros == "Mage"){
			this.heros = new HerosMage();
		} else if(heros == "Guerrier"){
			this.heros = new HerosGuerrier();
		} else if(heros == "Paladin"){
			this.heros = new HerosPaladin();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
}
