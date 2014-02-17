/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */


import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    public static void main(String[] args) {
    	
    	// Procédure d'acquisition des données simplifiée...
    	// Les types d'ingrédients sont les noms des interfaces existantes
    	List<String> ingredients = new ArrayList<String>();
    	ingredients.add("Olives");
    	ingredients.add("Moules");
    	// ...
    	
    	// Création de la pizzeria Brest : fabrique de pizzas façon Brest
    	Pizzeria pizzeriaBrest = new PizzeriaBrest();		 
		Pizza pizza = pizzeriaBrest.commanderPizza(ingredients);
		if (pizza != null)
			System.out.println("Luc a commandé une " + pizza + " - qui coûte " + pizza.calculePrix()+" €\n");
    	
    }
}

