/**
 * @author Fran�oise Perrin 
 * Inspiration package tetepremiere.fabrique.pizzaaf;
 */

import java.lang.reflect.Method;
import java.util.List;

public class PizzeriaBrest extends Pizzeria {

	protected Pizza creerPizza(List<String> ingredients) {

		Pizza pizza = null;
		FabriqueBasePizza fabriqueBase = null;
		FabriqueIngredientsPizza fabriqueIngredients = null;
		
		// On cr�e les pizzas en leur passant la fabrique de base sp�cifique Brest
		fabriqueBase = FabriqueBasePizzaBrest.newInstance();
		pizza = new BasePizza(fabriqueBase);
		if (pizza != null)
			pizza.setDescription("Pizza style Brest");

		// D�coration des pizzas . on se sert de la fabrique d'ingr�dients sp�cifiques de Brest
		fabriqueIngredients = FabriqueIngredientsPizzaBrest.newInstance();
		if (fabriqueIngredients != null) {
			// Pour chaque ingr�dient (qui est en fait un nom d'interface) on invoke
			// la m�thode de la fabrique qui retourne un objet de ce type
			// Permet d'�viter les if ...
			for (String ingredient : ingredients){
				pizza = (Pizza) invoke(fabriqueIngredients, ingredient, new Object [] {pizza});
			}			
		}

		return pizza;		
	}

	// invoke, apr�s identification, la m�thode de la fabrique 
	// qui retourne un objet de type "className"
	private static Object invoke(Object factory, String className, Object[] args) {	
		Object o=null;
		try {
			Class<? extends Object> c = factory.getClass();
			Method[] m = c.getDeclaredMethods() ;	// liste des m�thodes de la fabrique	
			
			for(int i = 0; i < m.length; i++)		{
				// recherche de la m�thode qui retourne le type dont le nom est pass� en param�tre
				if((m[i].getReturnType()).getName().equals(className)){
					// invocation de la m�thode avec ses param�tres
					o = m[i].invoke(factory, args);
				}
			}
		}		
		catch (java.lang.reflect.InvocationTargetException e)		{
			// Exception d�clench�e si le constructeur invoqu�
			// a lui-m�me d�clench� une exception
			 e.printStackTrace();
		}
		catch (IllegalAccessException e)		{
			// La classe n'est pas accessible
			 e.printStackTrace();
		}
		return o;
	}

}
