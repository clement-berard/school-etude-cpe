package model;
/**
 * Vacataire du secteur public
 * @author bruno
 *
 */
public class VacPublic extends Vacataire{
	/**
	 * 
	 * @param n nom
	 * @param p prénom
	 * @param e vrai si étranger
	 * @param r vrai si renouvellement
	 */
	public VacPublic(String n, String p, boolean e, boolean r) {
		super(n, p, e, r);
		addPiece(Pieces.EMPLOYEUR);
		addPiece(Pieces.SALAIRE);
		addPiece(Pieces.CUMUL);
	}

}
