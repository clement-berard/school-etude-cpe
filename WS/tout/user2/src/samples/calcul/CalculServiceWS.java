package samples.calcul;

import samples.calcul.CalculServiceStub.Aditionner;
import samples.calcul.CalculServiceStub.AditionnerResponse;
import samples.calcul.CalculServiceStub.Multiplier;
import samples.calcul.CalculServiceStub.MultiplierResponse;

public class CalculServiceWS {

	public static void main(String[] args) throws Exception {

		CalculServiceStub stub = new CalculServiceStub(
				"http://cube.toutophone.com:8080/axis2/services/CalculService"); //Creation d'une communication avec le Web Service

		Aditionner aditionner = new Aditionner(); //Creation du parametre de la requete aditionner
		aditionner.setVala(5); 
		aditionner.setValb(7);
		
		AditionnerResponse aditionnerResponse = stub.aditionner(aditionner); //Creation de la reponse retourne par le Web Service a partir de la requete aditionner 
		System.out.println(aditionner.getVala()+" + "+aditionner.getValb()+" = "+aditionnerResponse.get_return());
		
		
		Multiplier multiplier = new Multiplier(); //Creation du parametre de la requete multiplier
		multiplier.setVala(8);
		multiplier.setValb(7);
		
		MultiplierResponse multiplierResponse = stub.multiplier(multiplier); //Creation de la reponse retourne par le Web Service a partir de la requete multiplier 
		System.out.println(multiplier.getVala()+" x "+multiplier.getValb()+" = "+multiplierResponse.get_return());
		
	}

}
