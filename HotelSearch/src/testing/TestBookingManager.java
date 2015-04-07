package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import hotelSearch.BookingManager;
import hotelSearch.ConnectException;
import hotelSearch.Facilities;
import hotelSearch.Hotel;
import hotelSearch.HotelSearch;
import hotelSearch.PriceGroup;
import hotelSearch.QueryDB;
import hotelSearch.Request;
import hotelSearch.StayLength;

import org.junit.Test;

public class TestBookingManager {

	ArrayList<Hotel> list;
	Request request;
	
	@Test
	public void test() throws ConnectException{
		
		QueryDB queryDB = new HotelSearch();
		
		StayLength day = new StayLength(2015, 6, 2, 2015, 6, 3);
		Facilities facs = new Facilities(1,0,0,0,0);
		PriceGroup priceGroup = new PriceGroup(false, false, true);
		
		Request request = new Request("Reykjavik", day, 3.0);
		request.addFacilities(facs);
		request.addPriceGroup(priceGroup);
		
		list = queryDB.getMatchingHotelsFromDB(request);
		
		Hotel hotel = list.get(0);
		
		BookingManager bm = new BookingManager();
		bm.reduceAvailability(hotel, request);
		
		
	}

}
