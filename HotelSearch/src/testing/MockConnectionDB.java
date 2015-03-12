package testing;

import java.util.ArrayList;

import hotelSearch.ConnectException;
import hotelSearch.Hotel;
import hotelSearch.QueryDB;

public class MockConnectionDB implements QueryDB {

	private ArrayList<Hotel> hotels;
	private String query;
	
	public MockConnectionDB(){
	
		this.query = query;
	}
	
	public ArrayList<Hotel> getMatchingHotelFromDB(String query) throws ConnectException {
		
		// FAKE ARRAY LIST
		ArrayList<Hotel> hotel_list = new ArrayList<Hotel>();
		ArrayList<String> facs = new ArrayList();
		facs.add("Kitchen facilities");
		facs.add("TV");
		Hotel hotel1 = new Hotel(01, "Hotel Saga", "101", 5900, facs);
		Hotel hotel2 = new Hotel(02, "Loft hostel", "101", 4900, facs);
		Hotel hotel3 = new Hotel(33, "Hotel Natura", "Reykjavik", 3490, facs);
		hotel_list.add(hotel1);
		hotel_list.add(hotel2);
		hotel_list.add(hotel3);
		//sends the query to the DB and returns a hotel
		
		return hotel_list; //return hotel;
	}

}
