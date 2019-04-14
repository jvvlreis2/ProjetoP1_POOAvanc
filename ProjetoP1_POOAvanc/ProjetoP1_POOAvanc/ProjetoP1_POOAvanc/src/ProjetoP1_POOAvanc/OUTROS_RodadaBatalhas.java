package ProjetoP1_POOAvanc;

import java.util.ArrayList;
import java.util.List;

public class OUTROS_RodadaBatalhas {

	public List<OUTROS_Batalha> setProximaBatalha(List<OUTROS_Batalha> bat){
		List <OUTROS_Batalha> batalhas = 
				new ArrayList <> ();
		for (int i = 0; i < bat.size(); i++) {
			bat.get(i).getVencedor().PegarArma();
			bat.get(i+1).getVencedor().PegarArma();
			batalhas.add(new OUTROS_Batalha(bat.get(i).getVencedor(),bat.get(i+1).getVencedor()));
			i++;
		}
		return batalhas;
	}
}
