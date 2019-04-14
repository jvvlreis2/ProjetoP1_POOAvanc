package Armas;

public class ARMAS_ArcoEFlechaBehavior implements ARMAS_WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("Ataque com arco e flecha");	
	}

	@Override
	public double getDano() {
		return 0.4;
	}
}
