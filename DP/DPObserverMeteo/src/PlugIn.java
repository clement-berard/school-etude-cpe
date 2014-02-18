import java.util.Observable;
import java.util.Observer;

public class PlugIn implements Observer {

	private int temperature;
	private int oldPression;
	private int pression;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getOldPression() {
		return oldPression;
	}

	public void setOldPression(int oldPression) {
		this.oldPression = oldPression;
	}

	public int getPression() {
		return pression;
	}

	public void setPression(int pression) {
		this.pression = pression;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}
