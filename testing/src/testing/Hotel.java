package testing;

import java.util.ArrayList;

public class Hotel {
	
	private int id;
	private String hotelName;
	private String location;
	private int roomPrice;
	private ArrayList facilities;
	
	public Hotel(int id, String hotelName, String location, int roomPrice, ArrayList facilities){
		
		this.id = id;
		this.hotelName = hotelName;
		this.location = location;
		this.roomPrice = roomPrice;
		this.facilities = facilities;
	}
	
	public String getHotelLocation(){
		return location;
	}
	
	public int totalAvailableRooms(String date){
		
	}
}

