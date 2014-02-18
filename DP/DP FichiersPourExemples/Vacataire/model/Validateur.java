package model;

import java.util.ArrayList;

/**
 * Cette classe permet de regrouper les validateurs et représente un validateur de vacataire
 * @author bruno
 *
 */
public class Validateur {
	/**
	 * Nom du validateur
	 */
	private String nom ="Nom";
	/**
	 * Listes des pieces que ce Validateur vérifie
	 */
	private ArrayList<String> pieces = new ArrayList<String>();
	
	
	/**
	 * Constructeur
	 * @param n le nom du validateur
	 * @param p liste des pieces
	 */
	public Validateur(String n, ArrayList<String> p){
		nom = n;
		pieces = p;
	}

	
	/**
	 * Valide le dossier du vacataire a
	 * @param a le vacataire dont le dossier doit être validé
	 * @return true si validation ok, false sinon
	 */
	public boolean valider(Vacataire a){
		boolean ret = true;
		//processus de validation
		for(String s: pieces){
			if(a.hasPiece(s)){
				if(a.hasPieceCourante(s)){a.addPieceValide(s);}
				else{ret = false;}//dossier non valide
			}
		}
		//TODO à poursuivre!
		//mise en place de chain of responsability
		
		return ret;
	}
	
	@Override
	public String toString(){
		return nom+" ("+getClass().getSimpleName()+")";
	}
	
	//TODO
	/*
	 * Ajouter les méthodes communes aux Validateur
	 */
	
	
}
