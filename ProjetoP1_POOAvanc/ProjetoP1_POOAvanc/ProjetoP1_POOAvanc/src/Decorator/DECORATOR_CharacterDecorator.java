package Decorator;

import Personagens.PERSONAGEMS_Character;

public abstract class DECORATOR_CharacterDecorator extends PERSONAGEMS_Character {
	private PERSONAGEMS_Character character;

	public PERSONAGEMS_Character getCharacter() {
		return character;
	}

	public void setCharacter(PERSONAGEMS_Character character) {
		this.character = character;
	}

	public String getNome() {
		return character.getNome();
	}

	public String getBuff() {
		return " Buff: " + getClass().getSimpleName() ;
	}
}
