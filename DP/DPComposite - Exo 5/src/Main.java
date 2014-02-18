import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// on créé 2 'dossiers'
		CompositeTag tag1 = new CompositeTag("Dossier 1");
		CompositeTag tag2 = new CompositeTag("Dossier 2");
		
		// on créé un dossier qui ira dans le dossier 1 
		CompositeTag tag_enfant1 = new CompositeTag("Dossier 3, enfant du dossier 1");
		// on ajouter un 'fichier' au dossier enfant 1
		tag_enfant1.ajouter(new Valeur("Fichier 1, enfant du dossier 3"));
		
		// on met le dossier enfant dans le dossier 1 
		tag1.ajouter(tag_enfant1);
		// on créé deux fichiers
		Valeur val1 = new Valeur("Fichier 1, enfant du dossier 1");
		Valeur val2 = new Valeur("Fichier 2, enfant du dossier 2");
		// ajoute un fichier dans le dossier 1 et 2
		tag1.ajouter(val1);
		tag2.ajouter(val2);

		// on affiche le nom du dossier 1 & 2
//		tag1.getTag();
//		tag2.getTag();
		
		ArrayList<Tag> list = tag1.getLes_enfants_tag();
		
		
		
		for (Tag t : list) {
			 System.out.println(t.getTag());
		}
		

	}

}
