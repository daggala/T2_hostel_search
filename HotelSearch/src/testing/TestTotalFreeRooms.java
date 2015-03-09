package testing;

import static org.junit.Assert.*;
import hotelSearch.Hotel;
import hotelSearch.Request;
import hotelSearch.StayLength;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTotalFreeRooms {

	
	StayLength day;
	Request req1;
	Hotel hotel1;
	private ArrayList<String> facs;
	
	@Before
	public void setup() {
	
		facs.add("Kitchen facilities");
		facs.add("TV");
		day = new StayLength(2014, 6, 1, 2014, 6, 5);
      	req1 = new Request("Reykjavik", day, 3);
      	hotel1 = new Hotel(03, "Hotel101", "Reykjavik", 5900, facs);
	}
	
	@After
	public void tearDown() {
		
		facs = null;
		day = null;
		req1 = null;
		hotel1 = null;
	
	}
	
	@Test
	public void test() {	
		
		assertEquals(hotel1.getTotalFreeRooms(req1.getFromDate()), 3);

	}
}
