package hotelSearch;

import java.util.ArrayList;

public class Hotel {

	private int id;
	private String hotelName;
	private String location;
	private int roomPrice;
	private int totalFreeRooms;
	private ArrayList<Integer> facilities;
	
	public Hotel(int id, String hotelName, String location, int roomPrice, ArrayList<Integer> facs){
		
		this.id = id;
		this.hotelName = hotelName;
		this.location = location;
		this.roomPrice = roomPrice;
		this.facilities = facs;
	}
	
	public String getHotelName(){
		return hotelName;
	}
	
	public String getHotelLocation(){
		return location;
	}
	
	public int getRoomPrice(){
		return roomPrice;
	}
	
	public ArrayList<Integer> getFacilities(){
		return facilities;
	}
}

