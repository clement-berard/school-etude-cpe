
public class Supplement extends Boisson{

	protected Boisson boisson;
	protected String nom;
	protected int prix;
	
	public Supplement(Boisson boisson) {
		this.boisson = boisson;
	}



	@Override
	public String preparer() {
		 String str = boisson.preparer();
		 return str + nom;
	}


}
