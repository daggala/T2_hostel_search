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

		String expected = "SELECT * FROM Hotels, Dates WHERE hotelId=id AND location='Reykjavik' AND \"010615\" >= 2;";

		StayLength day = new StayLength(2015, 06, 01, 2015, 6, 2);
		double beds = 3;
		Request req1 = new Request("Reykjavik", day, beds);

		QueryDB queryDB = new MockConnectException();

		HotelSearch hotelSearch = new HotelSearch(queryDB);

		String a = hotelSearch.makeQueryString(req1);
		System.out.println(a);

		assertEquals(expected, a);
		// it's failing... because the zero is missing before 1 and 6
	}

}
