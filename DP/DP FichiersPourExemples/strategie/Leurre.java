package tetepremiere.strategie;

public class Leurre extends Canard {
	public Leurre() {
		comportementVol = new NePasVoler();
		comportementCancan = new CancanMuet();
	}
	public void afficher() {
		System.out.println("Je suis un leurre");
	}
}
