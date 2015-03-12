package testing;

import static org.junit.Assert.assertEquals;
import hotelSearch.StayLength;
import hotelSearch.Request;



import org.joda.time.Days;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalcDays {

	
	@Test
	public void testTotalDays() {
		
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		Request req1 = new Request("Reykjavik", day, 3);
		assertEquals(4, day.getTotalDays());
		
	}

}
