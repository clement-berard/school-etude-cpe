package ecartType;

public class ApplicationTest {
    protected Application appli = new Application();

    public void traiteDonnees() {
        System.out.println("Saisie des données");
        appli.litDonnees();
        System.out.println("Calcul des statistiques "
                + " avec premier algo de l'écart type :");
        appli.calculeStatistiques(new AlgoEcartType1());
        appli.afficheStatistiques();
        System.out.println("Calcul des statistiques "
                + " avec second algo de l'écart type :");
        appli.calculeStatistiques(new AlgoEcartType2());
        appli.afficheStatistiques();
    }
}
