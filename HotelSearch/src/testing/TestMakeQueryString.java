package testing;

import static org.junit.Assert.*;
import hotelSearch.Facilities;
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
		Request request = new Request("Reykjavik", day, beds);
		request.addFacilities(facs);
		request.addPriceGroup(priceGroup);
		
	
		QueryDB hotelSearch = new HotelSearch();
	
	}
}
