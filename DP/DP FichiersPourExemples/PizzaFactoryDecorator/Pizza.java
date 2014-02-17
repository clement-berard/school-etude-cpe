/**
* @author Françoise Perrin 
* Inspiration package tetepremiere.fabrique.pizzaaf;
 */

public interface Pizza {  
    public double calculePrix();
    public void preparer();      
	public String getDescription() ;
	public void setDescription(String s) ;	
	public void cuire() ;
	public void couper() ;
	public void emballer() ;
	public String toString() ;
}
