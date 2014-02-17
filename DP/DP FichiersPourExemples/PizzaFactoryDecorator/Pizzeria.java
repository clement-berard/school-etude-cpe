//package tetepremiere.fabrique.pizzaaf;

import java.util.List;

public abstract class Pizzeria {
 
	protected abstract Pizza creerPizza(List<String> ingredients);
 
	public Pizza commanderPizza(List<String> ingredients) {
		Pizza pizza = creerPizza(ingredients);
		if (pizza != null) {
			pizza.preparer();
			pizza.cuire();
			pizza.couper();
			pizza.emballer();
		}
		return pizza;
	}
}
