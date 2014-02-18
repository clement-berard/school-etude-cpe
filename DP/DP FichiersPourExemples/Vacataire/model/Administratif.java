package model;

import java.util.ArrayList;
/**
 * Cette classe représente un administratif
 * @author bruno
 *
 */
public class Administratif extends Validateur{
	/**
	 * Constructeur
	 * @param n le nom du validateur
	 * @param p liste des pieces
	 */
	public Administratif(String n, ArrayList<String> p) {
		super(n, p);
	}
	
	/**
	 * Valide le dossier du vacataire a
	 * Si le vacataire n'a pas de numéro de dossier, tire un nombre au hasard entre 1 et 10000 
	 * pour en créer un (simplification, ne pourrait pas constituer une solution opérationnelle en production!)
	 * @param a le vacataire dont le dossier doit être validé
	 * @return true si validation ok, false sinon
	 */
	public boolean valider(Vacataire a){
		boolean ret = super.valider(a);
		
		if(ret){
			if(a.getNumDossier()==0){
				a.setNumDossier((int)(Math.random()*10000));
			}
		}
		return ret;
	}

}
