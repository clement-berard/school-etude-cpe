import java.util.List;

public class AlgoEcartType2 implements AlgoEcartType {

	
	private static AlgoEcartType2 instance;

	/**
	 * constructeur privé pour pas instancier cette classe
	 */
	private AlgoEcartType2() {
	}

	/**
	 * 
	 * @return
	 */
	public static AlgoEcartType2 getInstance() {
		if (instance == null)
			instance = new AlgoEcartType2();
		return instance;
	}
	
	@Override
	public Double ecartType(List<Double> valeurs) {
		Double somme, moyenne;
		somme = 0.0;
		for (Double valeur : valeurs)
			somme = somme + valeur;
		moyenne = somme / valeurs.size();
		somme = 0.0;
		for (Double valeur : valeurs)
			somme = somme + valeur * valeur;
		return (Double) Math.sqrt(somme / valeurs.size() - moyenne * moyenne);
	}

}
