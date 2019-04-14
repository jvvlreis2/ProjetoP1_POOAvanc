package ProjetoP1_POOAvanc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Decorator.DECORATOR_Agua;
import Decorator.DECORATOR_Fogo;
import Decorator.DECORATOR_Vento;
import Decorator.DECORATOR_Terra;
import Observer.OBSERVER_Observer;
import Observer.OBSERVER_Subject;
import Personagens.PERSONAGEMS_Character;

public class OUTROS_Batalha implements OBSERVER_Subject{
	private PERSONAGEMS_Character p1, p2,vencedor;
	static int nbatalhas = 1;

	private List<OBSERVER_Observer> observers = new ArrayList<OBSERVER_Observer>();
	public OUTROS_Batalha (PERSONAGEMS_Character p1, PERSONAGEMS_Character p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public PERSONAGEMS_Character getP1() {
		return p1;
	}

	public PERSONAGEMS_Character getP2() {
		return p2;
	}

	public void setVencedor(PERSONAGEMS_Character vencedor) {
		this.vencedor = vencedor;
	}

	public PERSONAGEMS_Character getVencedor() {
		return vencedor;
	}

	@Override
	public String toString() {
		return p1.getNome()+ " vs " + p2.getNome() +" |\n";
	}

	public void batalhar() {
		Random random = new Random();
		nbatalhas++;
		double a;
		if(nbatalhas == 16) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>--FINAL--<<<<<<<<<<<<<<<<<<<<<<<<<< \n");
		}else if(nbatalhas == 14 || nbatalhas == 15) {
			System.out.println("------------------------SEMI-FINAL---------------------------- \n");
		}else if(nbatalhas<=13 && nbatalhas>=10) {
			System.out.println("--------------------QUARTAS--DE--FINAL---------------------------- \n");
		}else {
			System.out.println("--------------------OITAVAS--DE--FINAL---------------------------- \n");
		}
		System.out.println(nbatalhas-1 + "° Batalha " + this.toString());
		System.out.println("--------------------COMECE!!!! \n");

		while (getP1().getVida() > 0 && getP2().getVida() > 0 ) {
			int luta = random.nextInt(2);
			switch (luta) {
			case 0:
				System.out.println(getP1().getNome() + "  Ataca");
				getP1().fight();
				getP2().setVida(getP2().getVida() - getP1().weaponBehavior.getDano() - getP1().getDano());
				a = getP2().getDano() + getP2().weaponBehavior.getDano();
			 	System.out.println(getP2().getNome() + " Recebeu " + a + " de Dano!");
				notifyObserver(getP1());
				break;
			case 1:
				System.out.println(getP2().getNome() + "  Ataca");
				getP2().fight();
				getP1().setVida(getP1().getVida()- getP2().weaponBehavior.getDano() - getP2().getDano());
				a = getP2().getDano() + getP2().weaponBehavior.getDano();
				System.out.println(getP1().getNome() + " Recebeu " + a + " de Dano!");
				notifyObserver(getP2());
				break;
			}
			System.out.println("<-------->\n");
			System.out.println(getP1().getNome() + " VIDA : " + getP1().getVida());
			System.out.println(getP2().getNome() + " VIDA : " + getP2().getVida());
		}

		if (getP1().getVida() > getP2().getVida()) {
			getP1().Recuperavida();
			System.out.println(getP1().getNome() + " Ganhou!!!");
			setVencedor(getP1());
		}else {
			getP2().Recuperavida();
			System.out.println(getP2().getNome() + " Ganhou!!!");
			setVencedor(getP2());
		}
		System.out.println("-----------------------------FIM-DA-BATALHA\n");
			int d = random.nextInt(4);
			switch (d) {
			case 0:
				setVencedor(new DECORATOR_Fogo(getVencedor()));
				break;
			case 1:
				setVencedor(new DECORATOR_Agua(getVencedor()));
				break;
			case 2:
				setVencedor(new DECORATOR_Vento(getVencedor()));
				break;
			case 3:
				setVencedor(new DECORATOR_Terra(getVencedor()));
				break;
			}
		if(nbatalhas < 16) {
		System.out.println(getVencedor().getNome() +" Esta com os buffs:" + getVencedor().getBuff() + " Com total de +" + getVencedor().getDano() + " de dano extra\n\n");
		}
	}

	@Override
	public void registerObserver(OBSERVER_Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(OBSERVER_Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObserver(PERSONAGEMS_Character character) {
		for(OBSERVER_Observer o: observers) {
			o.update(character);
		}

	}
}


































