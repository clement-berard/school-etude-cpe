package org.apache.ws.axis2;

import org.apache.ws.axis2.HotelManagerStub.GetHotel;
import org.apache.ws.axis2.HotelManagerStub.GetHotelResponse;

public class HotelManagerWS {

	
	public static void main(String[] args) throws Exception {
		HotelManagerStub stub = new HotelManagerStub("http://localhost:8080/hotel/services/HotelManager?wsdl");
		GetHotel request = new GetHotel();
		request.setId(1);
		
		GetHotelResponse response = stub.getHotel(request);
		
		System.out.println(""+response.get_return().getName());
	
	
	
	}
	
}
