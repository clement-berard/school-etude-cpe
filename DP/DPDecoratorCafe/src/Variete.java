
public class Variete extends Boisson{
	
	protected int prix;
	
	public Variete(String nom, int p) {
		this.nom = nom;
		this.prix = p;
	}
	
	@Override
	public String preparer() {
		return "je suis un "+nom+ " et je coute "+prix+ " est je suis constituer des elements suiv:\n";
	}


}
