/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

// Fabrique concrète de création des ingrédients d'une pizza  
// en fonction du style de la pizzeria

// Implémentée sous forme de Singleton

public class FabriqueIngredientsPizzaBrest implements FabriqueIngredientsPizza {
	private static FabriqueIngredientsPizzaBrest instance;

	private FabriqueIngredientsPizzaBrest() {
	}

	public static FabriqueIngredientsPizzaBrest newInstance() {
		if (instance == null)
			instance = new FabriqueIngredientsPizzaBrest();
		return instance;
	}
	public Moules creerMoules(Pizza pizza) {
		return new MoulesFraiches(pizza);
	}	
	public Olives creerOlives(Pizza pizza) {
		return new OliveNoire(pizza);
	}	
}
