
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boisson boisson = new Chocolat(
                			new Caramel(
                				new Colombia()));
		System.out.println(boisson.preparer());
	}	

}
