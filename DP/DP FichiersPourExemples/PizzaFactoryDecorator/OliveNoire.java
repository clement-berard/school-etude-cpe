/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

public class OliveNoire extends DecorateurPizza implements Olives {
    public OliveNoire(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 1.40 + super.calculePrix();
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " + Olives noires";
    }
    
    public String toString(){
    	return super.toString();
    }
}
