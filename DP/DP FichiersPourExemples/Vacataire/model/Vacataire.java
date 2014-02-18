package model;

import java.util.ArrayList;

/**
 * Cette classe représente un vacataire
 * @author bruno
 *
 */
public abstract class Vacataire {

	/** Nom du vacataire */
	private String nom = "";
	/** Prénom du vacataire*/
	private String prenom = "";
	
	/**mail*/
	private String mail ="";
	/**login*/
	private String login="";
	/** numéro du dossier*/
	private int numDossier = 0;
	
	
	
	/** Liste des pièces obligatoires pour ce vacataire*/
	private ArrayList<String> lPiecesObligatoires = new ArrayList<String>();
	
	/** Liste des pièces courantes (validables) pour ce vacataire*/
	private ArrayList<String> lPiecesCourantes = new ArrayList<String>();
	
	/** Liste des pièces validées pour ce vacataire*/
	private ArrayList<String> lPiecesValide = new ArrayList<String>();
	/**
	 * 
	 * @param n nom
	 * @param p prénom
	 * @param e vrai si étranger
	 * @param r vrai si renouvellement
	 */
	public Vacataire(String p, String n, boolean e, boolean r){
		nom = n;
		prenom = p;
		//pour tous
		lPiecesObligatoires.add(Pieces.FA);
		lPiecesObligatoires.add(Pieces.CHARTE);
		lPiecesObligatoires.add(Pieces.RIB);
		if(e){
			lPiecesObligatoires.add(Pieces.TS);
		}
		if(!r){
			lPiecesObligatoires.add(Pieces.CV);
			lPiecesObligatoires.add(Pieces.CVIT);
					
		}
	}

    /**
     * Cette méthode ajoute p à {@link #lPiecesObligatoires}
     * @param p nom de la pièce à ajouter
     */
	protected void addPiece(String p){
		if(!lPiecesObligatoires.contains(p)){
			lPiecesObligatoires.add(p);
		}
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the numDossier
	 */
	public int getNumDossier() {
		return numDossier;
	}

	/**
	 * @param numDossier the numDossier to set
	 */
	public void setNumDossier(int numDossier) {
		this.numDossier = numDossier;
	}

	/**
	 * Cette méthode renvoie true si p est contenue dans lPiecesObligatoires
	 * @param p nom de la pièce à chercher
	 * @return true si {@link #lPiecesObligatoires} contient p
	 */
	public boolean hasPiece(String p){
		return lPiecesObligatoires.contains(p);
	}


    /**
     * ajoute p à {@link #lPiecesCourantes}
     * @param p nom de la pièce à ajouter
     */	public void addPieceCourante(String p){
		if(!lPiecesCourantes.contains(p)){
			lPiecesCourantes.add(p);
		}
	}

	/**renvoie true si p est contenue dans le tableau listePiecesCourantes
	 * @param p nom de la pièce à chercher
	 * @return true si {@link #lPiecesCourantes} contient p
	 */
	public boolean hasPieceCourante(String p){
		return lPiecesCourantes.contains(p);
	}
	
	/**
     * ajoute p à {@link #lPiecesValide}
     * @param p nom de la pièce à ajouter
     */	public void addPieceValide(String p){
		if(!lPiecesValide.contains(p)){
			lPiecesValide.add(p);
		}
     }
     
     public String toString(){
    	 return prenom+" "+nom;
     }
}
