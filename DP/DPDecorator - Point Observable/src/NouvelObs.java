import java.util.Observable;
import java.util.Observer;

public class NouvelObs implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("bien up");
	}

}
