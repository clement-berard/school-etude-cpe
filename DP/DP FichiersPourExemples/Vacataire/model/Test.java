package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Juste une classe de test!
 * @author bruno
 *
 */
public class Test {
	/**
	 * liste des validateurs
	 */
	private ArrayList<Validateur> lVal = new ArrayList<Validateur>();
	
	/**
	 * liste des vacataires
	 */
	private ArrayList<Vacataire> lVac = new ArrayList<Vacataire>();
	
	/**
	 * Constructeur pour les tests
	 * Contient l'algo principal de test
	 */
	public Test(){
		System.out.println("************************\nDEBUTS TESTS OK");
		if(init()){
			//......
			if(validation()){
				//.....
				System.out.println("FIN TESTS OK\n************************");
			}
		}
	}
	/**
	 * Initialisation des listes {@link #lVac} et {@link #lVal}
	 * @return true si initialisation ok
	 */
	private boolean init(){
		boolean ret = true;
		
		try{
			//vacataire indépendant, renouvellement
			Vacataire vac1 = new VacIndependant("Bruno","Mascret",false,true);
	        vac1.addPieceCourante(Pieces.TS);
	        vac1.addPieceCourante(Pieces.CV);
	        vac1.addPieceCourante(Pieces.CVIT);
	        vac1.addPieceCourante(Pieces.CHARTE);
	        vac1.addPieceCourante(Pieces.FA);
	        vac1.addPieceCourante(Pieces.CET1);
	        vac1.addPieceCourante(Pieces.CET2);
	        vac1.addPieceCourante(Pieces.ASSURE);
	        vac1.addPieceCourante(Pieces.URSSAF);
	        vac1.addPieceCourante(Pieces.RIB);


	        // vacataire étranger, nouvelle candidature
	        Vacataire vac2 = new VacPublic("Sergei","Bubka",true,false);
	        vac2.addPieceCourante(Pieces.FA);
	        vac2.addPieceCourante(Pieces.TS);
	        vac2.addPieceCourante(Pieces.CV);
	        vac2.addPieceCourante(Pieces.CVIT);
	        vac2.addPieceCourante(Pieces.CUMUL);
	        
	        // vacataire privé, renouvellement
	        Vacataire vac3 = new VacPublic("Bill","Portes",true,true);
	        vac3.addPieceCourante(Pieces.FA);
	        vac3.addPieceCourante(Pieces.TS);
	        vac3.addPieceCourante(Pieces.CV);
	        vac3.addPieceCourante(Pieces.CVIT);
	        vac3.addPieceCourante(Pieces.RIB);
	        vac3.addPieceCourante(Pieces.URSSAF);
	        
	        lVac.add(vac1);
	        lVac.add(vac2);
	        lVac.add(vac3);
	        
	        //création de listes de pieces administratives attendues par des validateurs
	        String[] piecesVal1 = {Pieces.FA,Pieces.TS, Pieces.CV, Pieces.CVIT};
	        String[] piecesVal2 = {Pieces.RIB, Pieces.CET1, Pieces.CET2, Pieces.URSSAF};
	        String[] piecesVal3 = {Pieces.CHARTE, Pieces.FA};
	        String[] piecesVal4 = {Pieces.ASSURE, Pieces.CUMUL, Pieces.EMPLOYEUR, Pieces.SALAIRE};

	        ArrayList<String> pieces1 = new ArrayList<String>(Arrays.asList(piecesVal1));
	        ArrayList<String> pieces2 = new ArrayList<String>(Arrays.asList(piecesVal2));
	        ArrayList<String> pieces3 = new ArrayList<String>(Arrays.asList(piecesVal3));
	        ArrayList<String> pieces4 = new ArrayList<String>(Arrays.asList(piecesVal4));
	        /*
	         * Création des validateurs
	         * Maryse fait suivre à Aurélie
	         * Aurélie fait suivre à Cédric
	         * Cédric fait suivre à Robert
	         */

	        lVal.add(new Administratif("Robert" , pieces4));
	        lVal.add(new Informaticien("Cédric" , pieces3));
	        lVal.add(new Administratif("Aurélie", pieces2));
	        lVal.add(new Validateur   ("Maryse" , pieces1));
		}
		catch(Exception e){
			ret = false;
		}
		return ret;
	}
	

	private boolean validation() {
		boolean ret = true;
		
		//tests à compléter après pattern appliqué
		for(Vacataire v:lVac){
			System.out.println(v+": "+v.getLogin()+"; "+v.getMail()+"; "+v.getNumDossier());
			for(Validateur val: lVal){
				System.out.println("\t"+val+": "+val.valider(v));
			}
			System.out.println("\tfin:"+v+": "+v.getLogin()+"; "+v.getMail()+"; "+v.getNumDossier());
		}
		
		return ret;
	}
	/**
	 * main
	 * @param strs arguments de la ligne de commande
	 */
	public static void main(String [] strs){
		new Test();
	}
}
