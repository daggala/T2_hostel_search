package testing;

import static org.junit.Assert.*;
import hotelSearch.Hotel;
import hotelSearch.HotelSearch;
import hotelSearch.QueryDB;
import hotelSearch.Request;
import hotelSearch.StayLength;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestFindHotels {
	
	ArrayList<Hotel> hotel_list;
	ArrayList<Hotel> list;
	Request request;

	@Before
	public void setUp() {
		// Fake list of hotels
				hotel_list = new ArrayList<Hotel>();
				ArrayList<String> facs = new ArrayList<String>();
				facs.add("Kitchen facilities");
				facs.add("TV");
				Hotel hotel1 = new Hotel(01, "Hotel Saga", "101", 5900, facs);
				Hotel hotel2 = new Hotel(02, "Loft hostel", "101", 4900, facs);
				Hotel hotel3 = new Hotel(33, "Hotel Natura", "Reykjavik", 3490, facs);
				hotel_list.add(hotel1);
				hotel_list.add(hotel2);
				hotel_list.add(hotel3);
				
				//Fake request
				StayLength days = new StayLength(2014, 6, 1, 2014, 6, 5);
				request = new Request("Reykjavik", days, 3);
	}
	
	@Test
	public void testFindHotels() {
		
		//Making instance of the mock DB, using polymorphism
		QueryDB queryDB = new MockConnectionDB();
	
		//Making instance of an object of a class that we're testing
		HotelSearch hotelSearch = new HotelSearch(queryDB);
		 
		list = hotelSearch.findHotels(request);
		assertNotNull(list);
		assertEquals(3, list.size());
		assertEquals(list.get(1).getHotelLocation(), hotel_list.get(1).getHotelLocation());
		assertEquals(list.get(2).getHotelLocation(), hotel_list.get(2).getHotelLocation());
		
		
	}

	@Test
	public void testFindHotelsFailure() {
		
		//Making instance of the mock DB, using polymorphism
		QueryDB queryDB = new MockConnectException();
	
		//Making instance of an object of a class that we're testing
		HotelSearch hotelSearch = new HotelSearch(queryDB);
		 
		list = hotelSearch.findHotels(request);
		
		assertNotNull(list);
		assertEquals(0, list.size());
				
	}
}