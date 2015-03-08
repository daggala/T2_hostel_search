package testing;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.*;

public class HotelSearchTest {
	
	private Request req1;
	private MockDB hotelQuery;
	private ArrayList<String> facs;
	
	private ArrayList<Hotel> expected_list;
	private ArrayList<Hotel> hotel_list;
	private Hotel hotel1, hotel2;
	
	@Before
	public void setup() {
		
		req1 = new Request("Reykjavik", "2015/06/01", "2015/07/02", 3);
		facs.add("Kitchen facilities");
		facs.add("TV");
		hotel1 = new Hotel(03, "Hotel101", "Reykjavik", 5900, facs);
		hotel2 = new Hotel(04, "Hotel RVK", "Reykjavik", 4900, facs);
		expected_list.add(hotel1);
		expected_list.add(hotel2);
	
	}
	
	@After
	public void tearDown() {
		req1 = null;
		hotel1 = null;
		hotel2 = null;
		facs.clear();

	}
	
	@Test
	public void test() {
		
		assertEquals(hotelSearch(req1), expected_list);
	}
}
