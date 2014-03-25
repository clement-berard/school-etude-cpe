/**
 * 
 * @author Françoise PERRIN
 */

import java.util.Observer;


public class XTestTreeSleeper {

	public static void main(String[] args) {
		
		Mammouth m = new Mammouth("Ellie");
		TreeSleeperAdapterMammouth e = new TreeSleeperAdapterMammouth(m);
		
		System.out.println(m.toString());
		System.out.println(e.toString());

		// création d'un écouteur de TreeSleeper sur les évènements liés au réveil et à l'endormissement
//		Observer Vue = new TreeSleeperVueConsole(); 
//		
//		// création des objets TreeSleeper
//		IObservable opossum  =  
//			(IObservable) new TreeSleeperDecorateObservable(
//				new Opossum("Crash"), new SujetObservable());
//		
//		IObservable mammouthAdapte  =  
//			(IObservable) new TreeSleeperDecorateObservable (
//				new TreeSleeperAdapterMammouth(new Mammouth("Ellie")), 
//				new SujetObservable());
//		
//		
//		// écoute du TreeSleeper
//		opossum.addObserver(Vue);
//		mammouthAdapte.addObserver(Vue);
//		
//		// simulation de l'écoute des évènements liés au réveil et à l'endormissement
//		System.out.println("\n\tSimulerEndormissement\n");		
//		simulerEndormissement((ITreeSleeper)opossum);
//		simulerEndormissement((ITreeSleeper)mammouthAdapte);
//		System.out.println("\n\tSimulerRéveil\n");	
//		simulerReveil((ITreeSleeper)opossum);
//		simulerReveil((ITreeSleeper)mammouthAdapte);
		
	}

	// par récursivité, sleepInTree serait appelé pour tous les TreeSleepers d'un Composite
	// ou sur 1 seul selon ce qui est passé en paramètre
	static void simulerEndormissement(ITreeSleeper treeSleeper) {			
		treeSleeper.sleepInTree();		
	}

	static void simulerReveil(ITreeSleeper treeSleeper) {		
		treeSleeper.awakening();
	}

}
