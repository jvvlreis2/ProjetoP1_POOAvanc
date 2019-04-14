package Armas;

public class ARMAS_FacaBehavior implements ARMAS_WeaponBehavior{
	int dano = 15;
	@Override
	public void useWeapon() {
		System.out.println("Ataque com faca");
	}

	@Override
	public double getDano() {
		return 0.3;
	}
}
