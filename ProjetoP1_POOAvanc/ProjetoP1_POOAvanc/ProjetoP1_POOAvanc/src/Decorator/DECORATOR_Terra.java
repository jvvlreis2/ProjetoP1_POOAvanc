package Decorator;

import Personagens.PERSONAGEMS_Character;

public class DECORATOR_Terra extends DECORATOR_CharacterDecorator {

	public DECORATOR_Terra(PERSONAGEMS_Character character) {
		this.setCharacter(character);
	}
	
	@Override
	public void fight() {
		weaponBehavior.useWeapon();

	}
	
	public String getNome() {
		return getCharacter().getNome();
	}
	
	@Override
	public double getDano() {
		return 0.15 + getCharacter().getDano();
	}
	
	public String getBuff() {
		return getCharacter().getBuff() + " Terra(+0.15) \n";
	}
	

}
