package testing;

import static org.junit.Assert.*;
import hotelSearch.ConnectException;
import hotelSearch.HotelSearch;
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
	public void testFindHotels() throws ConnectException {
		
		//Making instance of the mock DB, using polymorphism
		QueryDB queryDB = new HotelSearch();
	

		
		StayLength day = new StayLength(2015, 6, 1, 2015, 6, 5);
		
		Request request = new Request("Reykjavik", day, 800);

		list = queryDB.getMatchingHotelsFromDB(request);
		assertNotNull(list);
		System.out.println(list.get(0).getHotelLocation());
		
		Hotel hotel = list.get(0);
		int a = hotel.getFacilities().get(2);
		
		System.out.println(a);
	}
}
