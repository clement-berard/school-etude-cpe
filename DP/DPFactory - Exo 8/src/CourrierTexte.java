
/**
 * 
 * @author cberard
 *
 */
class CourrierTexte extends Courrier {
	protected Contenu nouveauContenu() {
		return new ContenuTexte();
	}
}