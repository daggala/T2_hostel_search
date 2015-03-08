package testing;

import java.util.ArrayList;

public class MockDB implements ConnectionDB {
	
	private Request request;
	private Hotel hotel;
	private ArrayList<Hotel> list;
	
	public MockDB(Request request, Hotel hotel){
		this.request = request;
		this.hotel = hotel;
	}
	
	public ArrayList<Hotel> checkAvailability(){
		
		
		if(request.getLocation() == hotel.getHotelLocation()  ){
			
		}
		
		
		return list;
		
	}
}
