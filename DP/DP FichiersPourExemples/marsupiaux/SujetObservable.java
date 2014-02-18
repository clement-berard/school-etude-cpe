/**
 * 
 * @author Françoise PERRIN
 */

import java.util.Observable;


public class SujetObservable extends Observable {
	public void notifyObservers(Object o) {	
		super.notifyObservers(o); 
		setChanged();
	}	
}
