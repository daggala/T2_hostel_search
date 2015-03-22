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

public class TestFindHotels {

	ArrayList<Hotel> list;
	Request request;

	@Test
	public void testFindHotels() {
		
		//Making instance of the mock DB, using polymorphism
		QueryDB queryDB = new ConnectionDB();
	
		//Making instance of an object of a class that we're testing
		HotelSearch hotelSearch = new HotelSearch(queryDB);
		
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		Request request = new Request("Reykjavik", day, 800);

		list = hotelSearch.findHotels(request);
		assertNotNull(list);

		System.out.println(list.get(0).getHotelLocation());
		
	}
}
