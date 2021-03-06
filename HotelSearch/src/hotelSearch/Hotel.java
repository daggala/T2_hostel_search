package hotelSearch;

import java.util.ArrayList;

public class Hotel {

	private int id;
	private String hotelName;
	private String location;
	int priceGroup;
	private int roomPrice;
	private Facilities facilities;
	
	public Hotel(int id, String hotelName, String location, int priceGroup, int roomPrice, Facilities facs){
		
		this.id = id;
		this.hotelName = hotelName;
		this.location = location;
		this.roomPrice = roomPrice;
		this.priceGroup = priceGroup;
		this.facilities = facs;
	}
	
	public int getHotelID(){
		return id;
	}
	
	public String getHotelName(){
		return hotelName;
	}
	
	public String getHotelLocation(){
		return location;
	}
	
	public int getPriceGroup(){
		return priceGroup;
	}
	
	public int getRoomPrice(){
		return roomPrice;
	}
	
	public Facilities getFacilities(){
		return facilities;
	}
	
}

