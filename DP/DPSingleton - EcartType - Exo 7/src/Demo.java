public class Demo {

	public static void main(String[] args) {
		Application appli = new Application();
		ApplicationTest appliTest = new ApplicationTest();

		appli.litDonnees();
		appli.calculeStatistiques(AlgoEcartType1.getInstance());
		appli.afficheStatistiques();

		appliTest.traiteDonnees();
		// code masqué
		appliTest.traiteDonnees();
	}

}
