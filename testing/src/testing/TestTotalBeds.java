package testing;

import static org.junit.Assert.*;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTotalBeds {

	Date fromDate, toDate;
	Request req1;
	
	@Before
	public void setup() {
	
      	req1 = new Request("Reykjavik", "2015/06/01", "2015/07/02", 3);
	}
	
	@After
	public void tearDown() {
		
		fromDate = null;
		toDate = null;
		req1 = null;
	
	}
	
	@Test
	public void test() {	
		
		assertEquals(3, req1.getTotalBeds());

	}

}
