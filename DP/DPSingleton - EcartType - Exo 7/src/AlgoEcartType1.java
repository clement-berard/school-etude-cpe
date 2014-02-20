import java.util.List;

public class AlgoEcartType1 implements AlgoEcartType {

	private static AlgoEcartType1 instance;

	/**
	 * constructeur privé pour pas instancier cette classe
	 */
	private AlgoEcartType1() {
	}

	/**
	 * 
	 * @return
	 */
	public static AlgoEcartType1 getInstance() {
		if (instance == null)
			instance = new AlgoEcartType1();
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
			somme = somme + (valeur - moyenne) * (valeur - moyenne);
		return Math.sqrt(somme / valeurs.size());
	}

}
