/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

public class BasePizza implements Pizza{
    protected String description = ""; 
    protected FabriqueBasePizza fabriqueBasePizza;
    Pate pate;
	Sauce sauce;
	Fromage fromage;
    
	public BasePizza() {
		fabriqueBasePizza = null;
		description = ""; 
		pate = null;
		sauce = null;
		fromage = null;
	}
	
	public BasePizza(FabriqueBasePizza fabriqueBasePizza) {
		this.fabriqueBasePizza = fabriqueBasePizza;
		description = ""; 
		pate = null;
		sauce = null;
		fromage = null;
	}
	
    public void preparer() {		
    	if (fabriqueBasePizza != null){    		
    		pate = fabriqueBasePizza.creerPate();    		
    		sauce = fabriqueBasePizza.creerSauce();    		
    		fromage = fabriqueBasePizza.creerFromage();
    		// Vérif valeurs
    		System.out.println("Préparation de " + description +" : ");
    		System.out.println("\tPâte : " + pate);
    		System.out.println("\tSauce : " + sauce);
    		System.out.println("\tFromage : " + fromage);
    		
    		description += " : " + pate + ", " + sauce + ", " + fromage;
    	}
    }    

	public double calculePrix() {
        return 6.0;
    }
	
	public String getDescription() {
	        return description;
	} 
	
	public void setDescription(String description) {
		this.description = description;
	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180° ;");
	}

	public void couper() {
		System.out.println("Découpage en parts triangulaires ;");
	}

	public void emballer() {
		System.out.println("Emballage dans une boite officielle.");
	}

    public String toString() {
		return description ;
	}

}
