package Armas;

public class ARMAS_MachadoBehavior implements ARMAS_WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("Ataque com machado");
	}

	@Override
	public double getDano() {
		return 0.2;
	}
}
