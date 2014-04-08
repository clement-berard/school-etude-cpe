import java.sql.Date;
import java.util.GregorianCalendar;


public class Main {

	public static void main(String[] args) {
		
		
		
		HotelManager hm = new HotelManager();
		hm.search(new GregorianCalendar(2014,03,30), "castel");
//		Hotel h = hm.getHotel(3);
//		
//		System.out.println(h.toString());
		
		

	}

}
