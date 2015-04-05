package testing;

import static org.junit.Assert.*;
import hotelSearch.BookingManager;
import hotelSearch.ConnectException;
import hotelSearch.Facilities;
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
	
		StayLength day = new StayLength(2015, 6, 1, 2015, 6, 2);
		Facilities facs = new Facilities(1,0,0,0,0);
		
		Request request = new Request("Reykjavik", day, 3.0);
		request.addFacilities(facs);
		request.addPriceGroup(3);
		
		list = queryDB.getMatchingHotelsFromDB(request);
		
		assertNotNull(list);
		
		System.out.println(list.get(0).getHotelLocation());
		
		Hotel hotel = list.get(0);
		
		System.out.println(hotel.getHotelLocation());
		System.out.println(hotel.getHotelID());
		System.out.println(hotel.getPriceGroup());
		
		Facilities facs1 = hotel.getFacilities();
		System.out.println(facs1.isTV());
		
		BookingManager bm = new BookingManager();
		bm.reduceAvailability(hotel, request);
		
		
	}
}
