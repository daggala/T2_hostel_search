package testing;

import static org.junit.Assert.*;
import hotelSearch.Request;
import hotelSearch.StayLength;
import org.junit.Test;

public class TestGetTotalRooms {

	@Test
	public void testTotalDays() {
		
		Request req1, req2, req3, req4, req5;
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		
		req1 = new Request("Reykjavik", day, 0);
		req2 = new Request("Reykjavik", day, 1);
		req3 = new Request("Reykjavik", day, 2);
		req4 = new Request("Reykjavik", day, 8);
		req5 = new Request("Reykjavik", day, 9);
		
		assertEquals(req1.getTotalRooms(), 0);
		assertEquals(req2.getTotalRooms(), 1);
		assertEquals(req3.getTotalRooms(), 1);
		assertEquals(req4.getTotalRooms(), 4);
		assertEquals(req5.getTotalRooms(), 5);
		
	}

}
