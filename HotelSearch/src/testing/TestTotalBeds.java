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


	@Test
	public void test() {
		
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		Request req1 = new Request("Reykjavik", day, 3);
		
		//make it throw exception? or what?
		//Request req2 = new Request("Reykjavik", day);
		
		assertEquals(3, req1.getTotalBeds());
		//assertEquals(3, req2.getTotalBeds());

	}

}
