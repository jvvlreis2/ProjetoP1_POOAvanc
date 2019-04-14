package Personagens;

import Armas.ARMAS_MachadoBehavior;

public class PERSONAGEMS_Troll extends PERSONAGEMS_Character {
	String nome = "Troll";
	public PERSONAGEMS_Troll () {
		setWeaponBehavior(new ARMAS_MachadoBehavior());
		setNome("Troll");
	}

	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
	public double getDano() {
		return dano;
	}

	public String getBuff() {
		return " \n";
	}	
}
