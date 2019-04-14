package Observer;

import Personagens.PERSONAGEMS_Character;

public interface OBSERVER_Subject {
	public void registerObserver(OBSERVER_Observer o);
	public void removeObserver(OBSERVER_Observer o);
	public void notifyObserver(PERSONAGEMS_Character character);
}
