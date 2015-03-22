package testing;

import static org.junit.Assert.*;
import hotelSearch.QueryDB;
import hotelSearch.StayLength;
import hotelSearch.Request;
import hotelSearch.HotelSearch;
import hotelSearch.QueryDB;

import org.junit.Test;


public class TestMakeQueryString {

	@Test
	public void test() {
		
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		double beds = 3;
		Request req1 = new Request("Reykjavik", day, beds);

		QueryDB queryDB = new MockConnectException();
	
		HotelSearch hotelSearch = new HotelSearch(queryDB);
		
		String a = hotelSearch.makeQueryString(req1);
		System.out.println(a);
	
		
	}

}
