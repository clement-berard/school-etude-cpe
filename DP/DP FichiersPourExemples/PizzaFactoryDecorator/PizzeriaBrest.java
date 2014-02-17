/**
 * @author Françoise Perrin 
 * Inspiration package tetepremiere.fabrique.pizzaaf;
 */

import java.lang.reflect.Method;
import java.util.List;

public class PizzeriaBrest extends Pizzeria {

	protected Pizza creerPizza(List<String> ingredients) {

		Pizza pizza = null;
		FabriqueBasePizza fabriqueBase = null;
		FabriqueIngredientsPizza fabriqueIngredients = null;
		
		// On crée les pizzas en leur passant la fabrique de base spécifique Brest
		fabriqueBase = FabriqueBasePizzaBrest.newInstance();
		pizza = new BasePizza(fabriqueBase);
		if (pizza != null)
			pizza.setDescription("Pizza style Brest");

		// Décoration des pizzas . on se sert de la fabrique d'ingrédients spécifiques de Brest
		fabriqueIngredients = FabriqueIngredientsPizzaBrest.newInstance();
		if (fabriqueIngredients != null) {
			// Pour chaque ingrédient (qui est en fait un nom d'interface) on invoke
			// la méthode de la fabrique qui retourne un objet de ce type
			// Permet d'éviter les if ...
			for (String ingredient : ingredients){
				pizza = (Pizza) invoke(fabriqueIngredients, ingredient, new Object [] {pizza});
			}			
		}

		return pizza;		
	}

	// invoke, après identification, la méthode de la fabrique 
	// qui retourne un objet de type "className"
	private static Object invoke(Object factory, String className, Object[] args) {	
		Object o=null;
		try {
			Class<? extends Object> c = factory.getClass();
			Method[] m = c.getDeclaredMethods() ;	// liste des méthodes de la fabrique	
			
			for(int i = 0; i < m.length; i++)		{
				// recherche de la méthode qui retourne le type dont le nom est passé en paramètre
				if((m[i].getReturnType()).getName().equals(className)){
					// invocation de la méthode avec ses paramètres
					o = m[i].invoke(factory, args);
				}
			}
		}		
		catch (java.lang.reflect.InvocationTargetException e)		{
			// Exception déclenchée si le constructeur invoqué
			// a lui-même déclenché une exception
			 e.printStackTrace();
		}
		catch (IllegalAccessException e)		{
			// La classe n'est pas accessible
			 e.printStackTrace();
		}
		return o;
	}

}
