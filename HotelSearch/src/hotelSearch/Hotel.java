package hotelSearch;

import java.util.ArrayList;

public class Hotel {
	
	private int id;
	private String hotelName;
	private String location;
	private int roomPrice;
	private ArrayList facilities;
	private int totalFreeRooms;
	
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
	
	//New method - add to UML
	public int getTotalFreeRooms(int year, int month, int day){
		
		//DB QUERY...
		return totalFreeRooms;
	}
}

