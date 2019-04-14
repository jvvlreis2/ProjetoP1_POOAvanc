package Personagens;

import Armas.ARMAS_FacaBehavior;

public class PERSONAGEMS_Rainha extends PERSONAGEMS_Character {
	String nome = "Rainha";
	public PERSONAGEMS_Rainha () {
		setWeaponBehavior(new ARMAS_FacaBehavior());
		setNome("Rainha");
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
