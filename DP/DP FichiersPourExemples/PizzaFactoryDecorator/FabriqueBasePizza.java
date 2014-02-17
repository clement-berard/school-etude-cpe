/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

// Fabrique abstraite de création de labase d'une pizza en 
// fonction du style de la pizzeria
public interface FabriqueBasePizza {	
	public Pate creerPate();
	public Sauce creerSauce();
	public Fromage creerFromage();	
}
