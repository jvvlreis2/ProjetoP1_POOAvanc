package Armas;

public class ARMAS_CanhaoBehavior implements ARMAS_WeaponBehavior {
	int dano = 30;
	@Override
	public void useWeapon() {
		System.out.println("Ataque com Canhão");
	}

	@Override
	public double getDano() {
		return 0.5;
	}
}
