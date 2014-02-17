/**
* @author Fran�oise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */


// Fabrique concr�te de cr�ation de labase d'une pizza  
// en fonction du style de la pizzeria

// Impl�ment�e sous forme de Singleton

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

