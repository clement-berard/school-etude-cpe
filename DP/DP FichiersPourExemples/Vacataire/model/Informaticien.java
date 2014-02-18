package model;

import java.util.ArrayList;
/**
 * Cette classe représente un informaticien
 * @author bruno
 *
 */
public class Informaticien extends Validateur{
	/**
	 * Constructeur
	 * @param n le nom du validateur
	 * @param p liste des pieces
	 */
	public Informaticien(String n, ArrayList<String> p) {
		super(n, p);
	}
	
	/**
	 * Valide le dossier du vacataire a
	 * Si le vacataire n'a pas de login et/ou pas de mail, crée un mail et/ou un login
	 * @param a le vacataire dont le dossier doit être validé
	 * @return true si validation ok, false sinon
	 */
	public boolean valider(Vacataire a){
		boolean ret = super.valider(a);
		
		if(ret){
			String login = a.getLogin();
			String mail = a.getMail();
			String nom = a.getNom().toLowerCase();
			String prenom = a.getPrenom();
			if(login.equals("")){
				if(prenom.length()>0 && nom.length()>0){
					login = (""+prenom.charAt(0)).toLowerCase();
					if(nom.length()<7){login+=nom;}
					else{login+= nom.substring(0, 7);}
				}
				a.setLogin(login);
			}
			if(mail.equals("")){
				if(prenom.length()>0 && nom.length()>0){
					a.setMail(prenom.toLowerCase()+"."+nom.toLowerCase()+"@ecole.fr");
				}
			}
		}
		return ret;
	}

}
