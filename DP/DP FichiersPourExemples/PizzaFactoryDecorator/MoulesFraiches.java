/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */


public class MoulesFraiches extends DecorateurPizza implements Moules {
	
	public MoulesFraiches(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculePrix() {
        return 2.60 + super.calculePrix();
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " + Moules fraiches";
    }
    
    public String toString(){
    	return super.toString();
    }
	
}
