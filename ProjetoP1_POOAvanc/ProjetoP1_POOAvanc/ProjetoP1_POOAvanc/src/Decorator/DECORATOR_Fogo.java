package Decorator;

import Personagens.PERSONAGEMS_Character;

public class DECORATOR_Fogo extends DECORATOR_CharacterDecorator {

	public DECORATOR_Fogo(PERSONAGEMS_Character character) {
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
		return 0.4 + getCharacter().getDano();
	}

	public String getBuff() {
		return getCharacter().getBuff() + " Fogo(+0.4) \n";
	}
}
