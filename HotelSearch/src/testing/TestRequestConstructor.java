package testing;

import hotelSearch.IllegalArgumentException;
import hotelSearch.Request;
import hotelSearch.StayLength;

import org.junit.Test;


public class TestRequestConstructor {


	@Test
	public void testLegalConstructorArgument() throws IllegalArgumentException {
		
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		Request req1 = new Request("", day, 3);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalConstructorArgument() {
		
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		Request req1 = new Request("", day, 3);
	}
}
