package Decorator;

import Personagens.PERSONAGEMS_Character;

public class DECORATOR_Agua extends DECORATOR_CharacterDecorator {

	public DECORATOR_Agua (PERSONAGEMS_Character character){
		this.setCharacter(character);
	}

	public void fight() {
		weaponBehavior.useWeapon();
	}
	public String getNome() {
		return getCharacter().getNome();
	}
	public double getDano() {
		return 0.3 + getCharacter().getDano();
	}
	public String getBuff() {
		return getCharacter().getBuff() + " Agua(+0.3) \n" ;
	}

}
