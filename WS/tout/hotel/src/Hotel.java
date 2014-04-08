
public final class Hotel {
	private double id;
	private String name;
	private String location;
	private String arrival;
	private String departure;

	public Hotel(int id, String name, String location, String arrival,
			String departure) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.arrival = arrival;
		this.departure = departure;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", location=" + location
				+ ", arrival=" + arrival + ", departure=" + departure + "]";
	}

}