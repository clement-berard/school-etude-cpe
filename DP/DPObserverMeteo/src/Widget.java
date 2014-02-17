import java.util.Observable;
import java.util.Observer;

public class Widget implements Observer {

	private int temperature;
	private int pression;
	private int humidite;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getPression() {
		return pression;
	}

	public void setPression(int pression) {
		this.pression = pression;
	}

	public int getHumidite() {
		return humidite;
	}

	public void setHumidite(int humidite) {
		this.humidite = humidite;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("WIDGET> Humidite modifie :"+arg);

	}

}
