package testing;

import static org.junit.Assert.*;
import hotelSearch.Request;
import hotelSearch.StayLength;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//A simple exampel of setter tester that we won't include in the assignment

public class TestTotalBeds {

	
	StayLength day;
	Request req1;
	
	@Before
	public void setup() {
	
		day = new StayLength(2014, 6, 1, 2014, 6, 5);
      	req1 = new Request("Reykjavik", day, 3);
      	
	}
	
	@After
	public void tearDown() {
		
		day = null;
		req1 = null;
	
	}
	
	@Test
	public void test() {	
		
		assertEquals(3, req1.getTotalBeds());

	}

}
