
public class Main {

	public static void main(String[] args) {
	
		
		Point p = new Point(18,44);
		DecorateurPoint deco = new DecorateurPoint(p);
		
		NouvelObs obs = new NouvelObs();
		deco.addObserver(obs);
		
		deco.setX(555);

		
		
	}

}
