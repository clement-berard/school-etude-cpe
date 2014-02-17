/**
* @author Fran�oise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

// Fabrique abstraite de cr�ation de labase d'une pizza en 
// fonction du style de la pizzeria
public interface FabriqueBasePizza {	
	public Pate creerPate();
	public Sauce creerSauce();
	public Fromage creerFromage();	
}
