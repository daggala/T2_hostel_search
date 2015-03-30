package hotelSearch;

import java.util.ArrayList;

public class Hotel {

	private String hotelName;
	private String location;
	private int totalFreeRooms;

	public Hotel(int id, String hotelName, String location, int roomPrice,
			ArrayList<String> facilities) {

		this.hotelName = hotelName;
		this.location = location;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getHotelLocation() {
		return location;
	}

}
