import java.util.ArrayList;
import java.util.GregorianCalendar;


public class FlightManager {

	ArrayList<Flight> listeVol;
	Flight vol1;
	Flight vol2;
	Flight vol3;
	Flight vol4;
	Flight vol5;
	Flight vol6;
	Flight vol7;
	Flight vol8;
	Flight vol9;
	Flight vol10;
	
	public FlightManager(){
		
		vol1 = new Flight(1, "BritishAirLine", "Lyon", "Marseille", "17/02/2014", "28/03/2014", 0);
		vol2 = new Flight(2, "BritishAirLine", "Marseille", "Lille", "1/01/2014", "2/03/2014", 0);
		vol3 = new Flight(3, "BritishAirLine", "Grenoble", "Marseille", "17/02/2014", "8/03/2014", 0);
		vol4 = new Flight(4, "BritishAirLine", "Lyon", "Grenoble", "17/03/2014", "28/03/2014", 0);
		vol5 = new Flight(5, "BritishAirLine", "Nice", "Marseille", "15/04/2014", "30/03/2014", 0);
		vol6 = new Flight(6, "BritishAirLine", "Bourg", "Marseille", "12/02/2014", "10/05/2014", 0);
		vol7 = new Flight(7, "BritishAirLine", "Lyon", "Marseille", "12/02/2014", "28/03/2014", 0);
		vol8 = new Flight(8, "BritishAirLine", "Lyon", "Bourg", "25/10/2014", "8/03/2014", 0);
		vol9 = new Flight(9, "BritishAirLine", "Rome", "Marseille", "7/11/2014", "2/03/2014", 0);
		vol10 = new Flight(10, "BritishAirLine", "Lyon", "Rome", "17/02/2014", "14/03/2014", 0);
		

	}
	
	public ArrayList<Flight> getFlightByGregorianCalendar(GregorianCalendar d){
		
		ArrayList<Flight> flightMatch = new ArrayList<Flight>();
		for (int i = 0; i < listeVol.size(); i++) {
			
			if (d.equals(listeVol.get(i).getDeparture()) ){
				flightMatch.add(listeVol.get(i));
			}
				
			
		}		
		return flightMatch;
		
	}
	
	public ArrayList<Flight> getFlightByFrom(String d){
		
		ArrayList<Flight> flightMatch = new ArrayList<Flight>();
		for (int i = 0; i < listeVol.size(); i++) {
			
			if (d.equals(listeVol.get(i).getFrom())){
				flightMatch.add(listeVol.get(i));
			}
				
			
		}		
		return flightMatch;
		
	}
	
	public ArrayList<Flight> getFlightByTo(String d){
		
		ArrayList<Flight> flightMatch = new ArrayList<Flight>();
		for (int i = 0; i < listeVol.size(); i++) {
			
			if (d.equals(listeVol.get(i).getTo())){
				flightMatch.add(listeVol.get(i));
			}
				
			
		}		
		return flightMatch;
		
	}
	
public ArrayList<Flight> getFlightById(double d){
		
		ArrayList<Flight> flightMatch = new ArrayList<Flight>();
		for (int i = 0; i < listeVol.size(); i++) {
			
			if (d == listeVol.get(i).getId()){
				flightMatch.add(listeVol.get(i));
			}
				
			
		}		
		return flightMatch;
		
	}
	
	
}
