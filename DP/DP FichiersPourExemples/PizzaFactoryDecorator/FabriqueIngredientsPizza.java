/**
* @author Fran�oise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

// Fabrique abstraite de cr�ation des ingr�dients d'une pizza  
// en fonction du style de la pizzeria

public interface FabriqueIngredientsPizza {
	
	public Moules creerMoules(Pizza pizza);	
	public Olives creerOlives(Pizza pizza); 
}
