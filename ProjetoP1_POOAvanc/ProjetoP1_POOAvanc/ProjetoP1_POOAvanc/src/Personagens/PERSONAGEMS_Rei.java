package Personagens;

import Armas.ARMAS_ArcoEFlechaBehavior;

public class PERSONAGEMS_Rei extends PERSONAGEMS_Character {
	String nome = "Rei";
	public PERSONAGEMS_Rei () {
		setWeaponBehavior(new ARMAS_ArcoEFlechaBehavior());
		setNome("Rei");
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
