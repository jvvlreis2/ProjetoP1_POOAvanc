package Personagens;
import Armas.*;

public class PERSONAGEMS_Cavaleiro extends PERSONAGEMS_Character {
	String nome = "Cavaleiro";
	public PERSONAGEMS_Cavaleiro () {
		setWeaponBehavior(new ARMAS_FacaBehavior());
		setNome("Cavaleiro");
	}

	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}

	@Override
	public double getDano() {
		return dano;
	}

	public String getBuff() {
		return " \n";
	}
}
