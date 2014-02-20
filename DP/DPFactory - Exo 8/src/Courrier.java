class Courrier {

	protected Contenu contenu;
	protected String destinataire;

	public Courrier(String type) {
		
	}

	/**
	 * 
	 * @return
	 */
	//abstract protected Contenu nouveauContenu(); // Factory Method

	/**
	 * 
	 * @param destinataire
	 * @param texte
	 */
	public void prepare(String destinataire, String texte) {
		this.destinataire = destinataire;
		contenu = nouveauContenu();
		contenu.encode(texte);
	}

	/**
	 * 
	 */
	public String toString() {
		String st = "destinataire : " + destinataire + "\n";
		st += "contenu : " + contenu.toString();
		return st;
	}
}