/**
 * 
 * @author Françoise PERRIN
 */

import java.util.Observable;
import java.util.Observer;

public interface IObservable  {
	public void addObserver(Observer observateur) ;
	public void notifyObservers(Object o) ;
	public void setObservable(Observable obs);
}
