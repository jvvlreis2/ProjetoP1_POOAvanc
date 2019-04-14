package Decorator;

import Personagens.PERSONAGEMS_Character;

public class DECORATOR_Vento extends DECORATOR_CharacterDecorator {

	public DECORATOR_Vento(PERSONAGEMS_Character character) {
		this.setCharacter(character);
	}
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}

	public String getNome() {
		return getCharacter().getNome();
	}
	public double getDano() {
		return 0.2 + getCharacter().getDano();
	}

	public String getBuff() {
		return getCharacter().getBuff() + " Vento(+0.2) \n";
	}



}
