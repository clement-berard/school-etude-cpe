
/**
 * 
 * @author cberard
 *
 */
class ContenuHtml implements Contenu {
	protected String codeHtml;

	public void encode(String texte) {
		codeHtml = "<HTML>" + texte + "</HTML>";
	}

	public String toString() {
		return (codeHtml);
	}
}