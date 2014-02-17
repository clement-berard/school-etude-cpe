/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */


// Fabrique concrète de création de labase d'une pizza  
// en fonction du style de la pizzeria

// Implémentée sous forme de Singleton

public class FabriqueBasePizzaBrest implements FabriqueBasePizza{
	private static FabriqueBasePizzaBrest instance;

	private FabriqueBasePizzaBrest() {
	}

	public static FabriqueBasePizzaBrest newInstance() {
		if (instance == null)
			instance = new FabriqueBasePizzaBrest();
		return instance;
	}

	public Pate creerPate() {
		return new PateFine();
	}

	public Sauce creerSauce() {
		return new SauceMarinara();
	}

	public Fromage creerFromage() {
		return new Reggiano();
	}
}

