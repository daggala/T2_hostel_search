package testing;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalcDays {
	Date fromDate, toDate;
	Request req1;
	
	@Before
	public void setup() {

		req1 = new Request("Reykjavik", "2015/06/01", "2015/07/02", 3);
		
		System.out.println(req1.calcDays());
	}
	
	@After
	public void tearDown() {
		
		fromDate = null;
		toDate = null;
		req1 = null;
	
	}
	
	@Test
	public void testTotalDays() {
		
		
		assertEquals(1, req1.calcDays());
	}

}
