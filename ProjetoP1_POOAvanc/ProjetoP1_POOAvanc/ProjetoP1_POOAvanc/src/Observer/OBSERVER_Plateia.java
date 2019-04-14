package Observer;
import Personagens.PERSONAGEMS_Character;
public class OBSERVER_Plateia implements OBSERVER_Observer {
	PERSONAGEMS_Character torcer;
	public void update(PERSONAGEMS_Character character) {
		if(character != torcer) {
			System.out.println("Plateia: 'BBUUUUUUHHH'\n");
		}else {
			System.out.println("Plateia: 'AEEEEE "+character.getNome()+ "'\n");
		}
	}
	public PERSONAGEMS_Character getTorcer() {
		return torcer;
	}
	public void setTorcer(PERSONAGEMS_Character torcer) {
		this.torcer = torcer;
	}
}
