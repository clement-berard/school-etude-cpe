/**
 * 
 * @author Françoise PERRIN
 */

import java.util.Observable;


public class SujetObservable extends Observable {
	public void notifyObservers(Object o) {	
		System.out.println("notifyObservers - SujetObservable");
		super.notifyObservers(o);
		setChanged();
	}	
}
