import java.util.Observable;

public class DonneeMeteo extends Observable {

	private int temperature;
	private int pression;
	private int humidite;

	public DonneeMeteo(int temperature, int pression, int humidite) {
		super();
		this.temperature = temperature;
		this.pression = pression;
		this.humidite = humidite;
		
	}

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
		setChanged();
		notifyObservers(pression);
	}

	public int getHumidite() {
		return humidite;
	}

	public void setHumidite(int humidite) {
		this.humidite = humidite;
		setChanged();
		notifyObservers(humidite);
	}
	
	
}
