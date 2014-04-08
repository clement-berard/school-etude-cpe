import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

public class HotelManager {

	HashMap<Integer, Hotel> hotelMap = new HashMap<Integer, Hotel>();

	/**
	 * 
	 */
	public HotelManager() {

		hotelMap.put(1, new Hotel(1, "Le Majestic", "Cannes", "2014/02/11",
				"2014/11/11"));
		hotelMap.put(2, new Hotel(2, "Le Cap Estel", "Èze", "2014/02/11",
				"2014/11/11"));
		hotelMap.put(3, new Hotel(3, "La Bastide Saint-Antoine", "Grasse",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(4, new Hotel(4, "AC Hôtel Ambassadeur", "Juan-les-Pins",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(5, new Hotel(5, "Le Mas Candille et Spa", "Mougins",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(6, new Hotel(6, "Hôtel Negresco", "Nice", "2014/02/11",
				"2014/11/11"));
		hotelMap.put(7, new Hotel(7, "Hôtel Boscolo Exedra Nice", "Nice",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(8, new Hotel(8, "Monte-Carlo Beach",
				"Roquebrune-Cap-Martin", "2014/02/11", "2014/11/11"));
		hotelMap.put(9, new Hotel(9, "Le Grand-Hôtel du Cap-Ferrat",
				"Saint-Jean-Cap-Ferrat", "2014/02/11", "2014/11/11"));
		hotelMap.put(10, new Hotel(10, "Le Mas de Pierre",
				"Saint-Paul-de-Vence", "2014/02/11", "2014/11/11"));
		hotelMap.put(11, new Hotel(11, "La Maison de Rhodes", "Troyes",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(12, new Hotel(12, "Hôtel de la Cité", "Carcassonne",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(13, new Hotel(13, "Hôtel le Pigonnet", "Aix-en-Provence",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(14, new Hotel(14, "Villa Gallici", "Aix-en-Provence",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(15, new Hotel(15, "Hôtel InterContinental Marseille",
				"Marseille", "2014/02/11", "2014/11/11"));
		hotelMap.put(16, new Hotel(16, "Hôtel Sofitel Marseille Vieux-Port",
				"Marseille", "2014/02/11", "2014/11/11"));
		hotelMap.put(17, new Hotel(17, "Le Petit Nice", "Marseille",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(18, new Hotel(18, "Hotel de prison", "Marseille",
				"2014/02/11", "2014/11/11"));
		hotelMap.put(19, new Hotel(19, "Le Balladin", "Cannes", "2014/02/11",
				"2014/11/11"));

	}

	/**
	 * 
	 * @param arrivee
	 * @param destination
	 * @return
	 */
	public ArrayList<Hotel> search(String arrivee, String destination) {
		ArrayList<Hotel> retour = new ArrayList<Hotel>();

		for (Hotel h : hotelMap.values()) {

			if (h.getLocation().equals(destination)
					&& h.getArrival().equals(arrivee))
				retour.add(h);

			System.out.println(h.toString());
		}
		return retour;

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Hotel getHotel(Integer id) {

		return hotelMap.get(id);

	}

}
