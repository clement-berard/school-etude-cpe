package ecartType;

import java.util.List;

public class AlgoEcartType1 implements AlgoEcartType {

    @Override
    public Double ecartType(List<Double> valeurs) {
        Double somme, moyenne;
        somme = 0.0;
        for (Double valeur : valeurs)
            somme = somme + valeur;
        moyenne = somme / valeurs.size();
        somme = 0.0;
        for (Double valeur : valeurs)
            somme = somme + (valeur - moyenne)
                    * (valeur - moyenne);
        return Math.sqrt(somme / valeurs.size());
    }

}
