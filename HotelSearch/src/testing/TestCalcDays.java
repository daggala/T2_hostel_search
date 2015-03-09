package testing;

import static org.junit.Assert.assertEquals;
import hotelSearch.StayLength;
import hotelSearch.Request;



import org.joda.time.Days;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalcDays {
	
	StayLength day; 
	Request req1;
	@Before
	public void setup() {
		
		day = new StayLength(2014, 6, 1, 2014, 6, 5);
		req1 = new Request("Reykjavik", day, 3);
		
		//System.out.println(req1.calcDays());
		System.out.println(day.getTotalDays());
	}
	
	@After
	public void tearDown() {
		
	
	}
	
	@Test
	public void testTotalDays() {
		assertEquals(4, day.getTotalDays());
		
	}

}
