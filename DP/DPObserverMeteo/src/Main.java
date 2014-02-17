public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DonneeMeteo donnee = new DonneeMeteo(10, 50, 20);
		Widget widget = new Widget();
		donnee.addObserver(widget);
		
		donnee.setHumidite(5);
		donnee.setPression(50);

	}

}
