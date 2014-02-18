
public class Billet {

	Etat reserve;
	Etat modifier;
	Etat annuler;
	
	Etat etat = reserve;
	public Billet() {
		reserve = new EtatReserver();
		annuler = new EtatAnnuler();
		modifier = new EtatModifier();
	}
	
	
	
}
