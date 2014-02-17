/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

// Fabrique abstraite de création des ingrédients d'une pizza  
// en fonction du style de la pizzeria

public interface FabriqueIngredientsPizza {
	
	public Moules creerMoules(Pizza pizza);	
	public Olives creerOlives(Pizza pizza); 
}
