package ProjetoP1_POOAvanc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Observer.OBSERVER_Plateia;
import Personagens.PERSONAGEMS_Cavaleiro;
import Personagens.PERSONAGEMS_Character;
import Personagens.PERSONAGEMS_Rainha;
import Personagens.PERSONAGEMS_Rei;
import Personagens.PERSONAGEMS_Troll;

public class MAIN_Campeonato {

	public static void main(String[] args) {
		Random random = new Random();
		OUTROS_RodadaBatalhas rodadaBatalhas = new OUTROS_RodadaBatalhas();
		List <OUTROS_Batalha> batalhas = 
				new ArrayList <> ();
		for (int i = 0; i < 8; i++) {
			int p1 = random.nextInt(4);
			PERSONAGEMS_Character personagem1 = null, personagem2 = null;
			switch (p1) {
			case 0:
				personagem1 = new PERSONAGEMS_Rei();
				break;
			case 1:
				personagem1 = new PERSONAGEMS_Rainha();
				break;
			case 2:
				personagem1 = new PERSONAGEMS_Troll();
				break;
			case 3:
				personagem1 = new PERSONAGEMS_Cavaleiro();
				break;		
			}
			int p2 = random.nextInt(4);
			switch (p2) {
			case 0:
				personagem2 = new PERSONAGEMS_Rei();
				break;
			case 1:
				personagem2 = new PERSONAGEMS_Rainha();
				break;
			case 2:
				personagem2 = new PERSONAGEMS_Troll();
				break;
			case 3:
				personagem2 = new PERSONAGEMS_Cavaleiro();
				break;
			}
			personagem1.PegarArma();
			personagem2.PegarArma();
			batalhas.add (new OUTROS_Batalha (personagem1, personagem2));
		}
		OBSERVER_Plateia pl = new OBSERVER_Plateia();
		System.out.println(batalhas);
		System.out.println("---------------------1°Rodada-------------------------");
		for(int n = 0; n < 4; n++) {
			for(OUTROS_Batalha batalha : batalhas) {
				int t= random.nextInt(1);
				batalha.registerObserver(pl);
				switch (t) {
				case 0:
					pl.setTorcer(batalha.getP1());
					break;
				case 1:
					pl.setTorcer(batalha.getP2());
					break;
				}

				batalha.batalhar();
			}
			if (n == 3) {
				break;
			}else {
				batalhas = rodadaBatalhas.setProximaBatalha(batalhas);
			}
		}
		System.out.println(batalhas.get(0).getVencedor().getNome()+ " Ganhou o Campeonato!!!!");
	}
}
