package testing;

import static org.junit.Assert.*;
import hotelSearch.ConnectionDB;
import hotelSearch.Hotel;
import hotelSearch.HotelSearch;
import hotelSearch.QueryDB;
import hotelSearch.Request;
import hotelSearch.StayLength;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestHotelSearch {
	
	@Test
	public void testFindHotels() {
		
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
		
		
		StayLength days = new StayLength(2014, 6, 1, 2014, 6, 5);
		Request request = new Request("Reykjavik", days, 3);
		
		QueryDB queryDB = new MockConnectionDB();
		
		HotelSearch hotelSearch = new HotelSearch(queryDB);
		
		//String query = hotelSearch.makeQueryString();
		
		ArrayList<Hotel> list = hotelSearch.findHotels(request);
		
		assertEquals(list, hotel_list);
		
	}

	@Test
	public void testFindHotelsFailure() {
		
	}
}