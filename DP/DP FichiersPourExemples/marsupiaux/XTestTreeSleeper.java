/**
 * 
 * @author Fran�oise PERRIN
 */

import java.util.Observer;


public class XTestTreeSleeper {

	public static void main(String[] args) {
		
		Mammouth m = new Mammouth("Ellie");
		TreeSleeperAdapterMammouth e = new TreeSleeperAdapterMammouth(m);
		
		System.out.println(m.toString());
		System.out.println(e.toString());

		// cr�ation d'un �couteur de TreeSleeper sur les �v�nements li�s au r�veil et � l'endormissement
//		Observer Vue = new TreeSleeperVueConsole(); 
//		
//		// cr�ation des objets TreeSleeper
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
//		// �coute du TreeSleeper
//		opossum.addObserver(Vue);
//		mammouthAdapte.addObserver(Vue);
//		
//		// simulation de l'�coute des �v�nements li�s au r�veil et � l'endormissement
//		System.out.println("\n\tSimulerEndormissement\n");		
//		simulerEndormissement((ITreeSleeper)opossum);
//		simulerEndormissement((ITreeSleeper)mammouthAdapte);
//		System.out.println("\n\tSimulerR�veil\n");	
//		simulerReveil((ITreeSleeper)opossum);
//		simulerReveil((ITreeSleeper)mammouthAdapte);
		
	}

	// par r�cursivit�, sleepInTree serait appel� pour tous les TreeSleepers d'un Composite
	// ou sur 1 seul selon ce qui est pass� en param�tre
	static void simulerEndormissement(ITreeSleeper treeSleeper) {			
		treeSleeper.sleepInTree();		
	}

	static void simulerReveil(ITreeSleeper treeSleeper) {		
		treeSleeper.awakening();
	}

}
