package testing;

import static org.junit.Assert.*;
import hotelSearch.Facilities;
import hotelSearch.InvalidTotalBedsException;
import hotelSearch.PriceGroup;
import hotelSearch.QueryDB;
import hotelSearch.StayLength;
import hotelSearch.Request;
import hotelSearch.HotelSearch;
import hotelSearch.QueryDB;

import org.junit.Test;


public class TestMakeQueryString {

	@Test
	public void test() {
		
	
		StayLength day = new StayLength(2015, 6, 1, 2015, 6, 3);
		double beds = 3;
		PriceGroup priceGroup = new PriceGroup(false, false, true);
		
		Facilities facs = new Facilities(1,0,0,0,0);
		Request request= null;
		try {
			request = new Request("Reykjavik", day, beds);
		} catch (InvalidTotalBedsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.addFacilities(facs);
		request.addPriceGroup(priceGroup);
		
	
		QueryDB hotelSearch = new HotelSearch();
	
	}
}
