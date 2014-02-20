
/**
 * 
 * @author cberard
 *
 */
class ContenuTexte implements Contenu {
	protected String texte;

	public void encode(String texte) {
		this.texte = texte;
	}

	public String toString() {
		return (texte);
	}
}