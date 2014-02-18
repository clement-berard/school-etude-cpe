package model;
/**
 * Vacataire du secteur privé
 * @author bruno
 *
 */
public class VacPrive extends Vacataire{
	/**
	 * 
	 * @param n nom
	 * @param p prénom
	 * @param e vrai si étranger
	 * @param r vrai si renouvellement
	 */
	public VacPrive(String n, String p, boolean e, boolean r) {
		super(n, p, e, r);
		addPiece(Pieces.EMPLOYEUR);
		addPiece(Pieces.SALAIRE);
	}

}
