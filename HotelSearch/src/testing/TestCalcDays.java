package testing;

import static org.junit.Assert.assertEquals;
import hotelSearch.StayLength;
import org.junit.Test;

public class TestCalcDays {

	
	@Test
	public void testTotalDays() {
		
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		assertEquals(4, day.getDaysBetweenDates());
		
	}

}
