package testing;

import org.joda.time.DateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import hotelSearch.Hotel;
import hotelSearch.Request;
import hotelSearch.StayLength;

import java.util.ArrayList;

import org.junit.*;

public class HotelSearchTest {
	
	private StayLength day;
	private Request req1;
	private ArrayList<String> facs;
	

	private ArrayList<Hotel> hotel_list;
	private Hotel hotel1, hotel2;
	
	@Before
	public void setup() {
		
		day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req1 = new Request("Reykjavik", day, 3);
		facs.add("Kitchen facilities");
		facs.add("TV");
		hotel1 = new Hotel(03, "Hotel101", "Reykjavik", 5900, facs);
		hotel2 = new Hotel(04, "Hotel RVK", "Reykjavik", 4900, facs);
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
		
		/*
		//athugar fyrst hvort til sé hótel í gagnagrunninum sem hefur sömu staðsetningu og í requestinu
		if(req1.getLocation() == hotel1.getHotelLocation()){
			
			//athugar svo fyrir hvern dag hvort nógu mörg herbergi séu frí
			for(int i = 0; i< req1.calcDays(); i++){

				if(req1.getTotalRooms() == hotel1.getTotalFreeRooms(req1.getFromDate())) {
					
				}
					
			}
			
		}
		
		//assertEquals(hotelSearch(req1), );
		 
		 */
	}
}
