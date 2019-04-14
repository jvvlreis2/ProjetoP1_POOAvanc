package Personagens;

import java.util.Random;

import Armas.*;


public abstract class PERSONAGEMS_Character {
	String nome;
	String buff;
	int dano = 0;
	private double vida = 1;
	
	public String getBuff() {
		return buff;
	}

	public abstract double getDano();

	public double getVida() {
		return vida;
	}
	
	public void setVida(double vida) {
		this.vida = vida;
		if (this.vida < 0) {
			this.vida = 0;
		}
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setWeaponBehavior (ARMAS_WeaponBehavior w) {
		this.weaponBehavior = w;
	}
	
	public ARMAS_WeaponBehavior weaponBehavior;
	public abstract void fight ();

	@Override
	public String toString() {
		return this.nome;
	}

	public  void Recuperavida() {
		vida = 100;
	}

	public void PegarArma() {
		Random random = new Random();
		int p2 = random.nextInt(4);
		switch (p2) {
		case 0:
			weaponBehavior = new ARMAS_ArcoEFlechaBehavior();
			break;
		case 1:
			weaponBehavior = new ARMAS_CanhaoBehavior();
			break;
		case 2:
			weaponBehavior = new ARMAS_MachadoBehavior();
			break;
		case 3:
			weaponBehavior = new ARMAS_FacaBehavior();
			break;
		}
	}

}
