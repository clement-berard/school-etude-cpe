
/**
 * 
 * @author cberard
 *
 */
class CourrierHtml extends Courrier {
	protected Contenu nouveauContenu() {
		return new ContenuHtml();
	}
}