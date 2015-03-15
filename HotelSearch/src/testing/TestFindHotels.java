package testing;

import static org.junit.Assert.*;
import hotelSearch.Hotel;
import hotelSearch.HotelSearch;
import hotelSearch.QueryDB;
import hotelSearch.Request;


import java.util.ArrayList;

import org.junit.Test;

public class TestFindHotels {
	
	ArrayList<Hotel> hotel_list;
	ArrayList<Hotel> list;
	Request request;

	@Test
	public void testFindHotels() {
		
		//Making instance of the mock DB, using polymorphism
		QueryDB queryDB = new MockConnectionDB();
	
		//Making instance of an object of a class that we're testing
		HotelSearch hotelSearch = new HotelSearch(queryDB);
		 
		list = hotelSearch.findHotels(request);
		
		assertNotNull(list);
	}

	@Test
	public void testFindHotelsFailureNotNull() {
		
		QueryDB queryDB = new MockConnectException();
	
		HotelSearch hotelSearch = new HotelSearch(queryDB);
		 
		list = hotelSearch.findHotels(request);
		
		assertEquals(null, list);
		
	}
}


