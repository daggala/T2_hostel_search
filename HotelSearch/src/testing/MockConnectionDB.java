package testing;

import java.util.ArrayList;

import hotelSearch.ConnectException;
import hotelSearch.Hotel;
import hotelSearch.QueryDB;
import hotelSearch.Request;

public class MockConnectionDB implements QueryDB {

	public MockConnectionDB(){
	}
	
	public ArrayList<Hotel> getMatchingHotelsFromDB(Request request) throws ConnectException{
		
		ArrayList<Hotel> hotel_list = new ArrayList<Hotel>();
		ArrayList<Integer> facs = new ArrayList<Integer>();
		facs.add(0);
		Hotel hotel1 = new Hotel(01, "Hotel Saga", "101", 5900, facs);
		Hotel hotel2 = new Hotel(02, "Loft hostel", "101", 4900, facs);
		Hotel hotel3 = new Hotel(33, "Hotel Natura", "Reykjavik", 3490, facs);
		hotel_list.add(hotel1);
		hotel_list.add(hotel2);
		hotel_list.add(hotel3);
		
		return hotel_list;
	}

}




