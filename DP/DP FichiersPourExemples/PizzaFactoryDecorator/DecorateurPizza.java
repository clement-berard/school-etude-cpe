/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

public abstract class DecorateurPizza extends BasePizza {
    protected Pizza pizza;

    public DecorateurPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double calculePrix() {
        return pizza.calculePrix();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
   
    public  void preparer(){
    	pizza.preparer();
    }
    
    public String toString(){
    	return getDescription();
    }
}
