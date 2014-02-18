package ecartType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    protected Scanner reader = new Scanner(System.in);
    protected List<Double> donnees = new ArrayList<Double>();
    protected Double ecartType;
    protected Double variance;

    public void litDonnees() {
        System.out
                .println("Entrez les données (toute lettre pour terminer) : ");
        String chaine = reader.next();
        while (chaine
                .matches("(\\+|-)?[1-9][0-9]*(\\.[0-9]*)?")) {
            donnees.add(Double.parseDouble(chaine));
            chaine = reader.next();
        }
    }

    public void calculeStatistiques(
            AlgoEcartType algoEcartType) {
        ecartType = algoEcartType.ecartType(donnees);
        variance = ecartType * ecartType;
    }

    public void afficheStatistiques() {
        System.out.println("Ecart-type : " + ecartType);
        System.out.println("Variance : " + variance);
    }
}
