package testing;

import java.util.ArrayList;

import hotelSearch.ConnectException;
import hotelSearch.Facilities;
import hotelSearch.Hotel;
import hotelSearch.QueryDB;
import hotelSearch.Request;

public class MockConnectionDB implements QueryDB {

	public MockConnectionDB(){
	}
	
	public ArrayList<Hotel> getMatchingHotelsFromDB(Request request) throws ConnectException{
		
		ArrayList<Hotel> hotel_list = new ArrayList<Hotel>();
		Facilities facs = new Facilities(0, 1, 1, 1, 1);
	
		Hotel hotel1 = new Hotel(01, "Hotel Saga", "101", 1, 5900, facs);
		Hotel hotel2 = new Hotel(02, "Loft hostel", "101", 2, 4900, facs);
		Hotel hotel3 = new Hotel(33, "Hotel Natura", "Reykjavik", 3, 3490, facs);
		hotel_list.add(hotel1);
		hotel_list.add(hotel2);
		hotel_list.add(hotel3);
		
		return hotel_list;
	}

	@Override
	public String makeQuery() {
		return null;
		// TODO Auto-generated method stub
		
	}
	

}




