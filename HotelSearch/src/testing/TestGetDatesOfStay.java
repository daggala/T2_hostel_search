package testing;

import static org.junit.Assert.*;
import java.util.ArrayList;
import hotelSearch.StayLength;
import org.junit.Test;

public class TestGetDatesOfStay {

	@Test
	public void test() {
		StayLength day = new StayLength(2015, 6, 1, 2015, 6, 3);
		
		ArrayList<String> days = new ArrayList<String>();
		
		days = day.getDatesOfStay();
		
		System.out.println(days.get(0));
		System.out.println(days.get(1));
		System.out.println(days.get(2));
		
		assertNotNull(days);
	}

}
