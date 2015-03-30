package testing;

import static org.junit.Assert.*;
import hotelSearch.Request;
import hotelSearch.StayLength;
import org.junit.Test;

public class TestGetTotalRooms {

	@Test
	public void testGetTotalRoomsNegativeNumber() {

		Request req0;
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req0 = new Request("Reykjavik", day, -3);
		assertEquals(0, req0.getTotalRooms());

	}

	@Test
	public void testGetTotalRoomsZero() {

		Request req1;
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req1 = new Request("Reykjavik", day, 0);
		assertEquals(0, req1.getTotalRooms());
	}

	@Test
	public void testGetTotalRoomsOne() {

		Request req2;
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req2 = new Request("Reykjavik", day, 1);
		assertEquals(1, req2.getTotalRooms());
	}

	@Test
	public void testGetTotalRoomsTwo() {

		Request req3;
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req3 = new Request("Reykjavik", day, 2);
		assertEquals(1, req3.getTotalRooms());
	}

	@Test
	public void testGetTotalRoomsEight() {

		Request req4;
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req4 = new Request("Reykjavik", day, 8);
		assertEquals(4, req4.getTotalRooms());
	}

	@Test
	public void testGetTotalRoomsNine() {

		Request req5;
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req5 = new Request("Reykjavik", day, 9);
		assertEquals(5, req5.getTotalRooms());
	}
}
