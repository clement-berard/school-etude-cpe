/**
 * 
 * @author Françoise PERRIN
 */

import java.util.Observable;
import java.util.Observer;


// DP Observer
// TreeSleeperVueConsole est un observateur de TreeSleeper

public class TreeSleeperVueConsole implements Observer {
 
	@Override
	public String toString() {
		return "TreeSleeperVueConsole";
	} 
	public void update(Observable arg0, Object treeSleeper) {
		System.out.println("Le " + treeSleeper + ((ITreeSleeper) treeSleeper).getSleepLong());
		//System.out.println("Le " + treeSleeper + treeSleeper.getSleepShort());
	}
	public TreeSleeperVueConsole() {
		super();
	}	
}
