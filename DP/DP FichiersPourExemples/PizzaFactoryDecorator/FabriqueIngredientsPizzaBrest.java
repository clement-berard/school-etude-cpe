/**
* @author Fran�oise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

// Fabrique concr�te de cr�ation des ingr�dients d'une pizza  
// en fonction du style de la pizzeria

// Impl�ment�e sous forme de Singleton

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
