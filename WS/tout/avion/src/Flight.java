
public class Flight {

	private double id;
	private String compagnyName;
	private String from;
	private String to;
	private String departure;
	private String arrival;
	private int seatAvailableCount;
	
	

	public Flight(double id, String compagnyName, String from, String to,
			String departure, String arrival, int seatAvailableCount) {
		super();
		this.id = id;
		this.compagnyName = compagnyName;
		this.from = from;
		this.to = to;
		this.departure = departure;
		this.arrival = arrival;
		this.seatAvailableCount = seatAvailableCount;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getCompagnyName() {
		return compagnyName;
	}

	public void setCompagnyName(String compagnyName) {
		this.compagnyName = compagnyName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public int getSeatAvailableCount() {
		return seatAvailableCount;
	}

	public void setSeatAvailableCount(int seatAvailableCount) {
		this.seatAvailableCount = seatAvailableCount;
	}

}
