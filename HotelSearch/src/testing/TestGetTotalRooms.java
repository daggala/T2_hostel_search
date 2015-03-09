package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import hotelSearch.Hotel;
import hotelSearch.Request;
import hotelSearch.StayLength;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestGetTotalRooms {

	private Request req1, req2, req3, req4, req5;
	private StayLength day;
	@Before
	public void setup() {

		day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req1 = new Request("Reykjavik", day, 0);
		req2 = new Request("Reykjavik", day, 1);
		req3 = new Request("Reykjavik", day, 2);
		req4 = new Request("Reykjavik", day, 8);
		req5 = new Request("Reykjavik", day, 9);
	}
	
	@After
	public void tearDown() {
		
		req1 = null;
		req2 = null;
		req3 = null;
		req4 = null;
		req5 = null;
	}
	
	@Test
	public void testTotalDays() {
	
		//fylla allt ut, testa allt saman
		assertEquals(req4.getTotalRooms(), 4);
	}

}
