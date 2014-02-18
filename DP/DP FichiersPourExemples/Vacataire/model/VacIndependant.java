package model;
/**
 * Vacataire indépendant
 * @author bruno
 *
 */
public class  VacIndependant extends Vacataire{
	/**
	 * 
	 * @param n nom
	 * @param p prénom
	 * @param e vrai si étranger
	 * @param r vrai si renouvellement
	 */
	public VacIndependant(String n, String p, boolean e, boolean r) {
		super(n, p, e, r);
		addPiece(Pieces.CET1);
		addPiece(Pieces.CET2);
		addPiece(Pieces.ASSURE);
		addPiece(Pieces.URSSAF);
	}

}
