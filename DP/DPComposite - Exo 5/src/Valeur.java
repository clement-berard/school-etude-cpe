public class Valeur extends Tag {

	public Valeur(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTag() {
		System.out.println("C'est un fichier :  " + this.name);
		return this.name;
	}

}
