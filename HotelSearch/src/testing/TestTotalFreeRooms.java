package testing;

import static org.junit.Assert.*;
import hotelSearch.Hotel;
import hotelSearch.Request;
import hotelSearch.StayLength;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTotalFreeRooms {

	
	
	@Test
	public void test() {
		
		StayLength day = new StayLength(2014, 6, 1, 2014, 6, 5);
		Request req1 = new Request("Reykjavik", day, 3);
		ArrayList<String> facs = new ArrayList<String>();
		
		facs.add("Kitchen facilities");
		facs.add("TV");
		
		Hotel hotel1 = new Hotel(03, "Hotel101", "Reykjavik", 5900, facs);
		
		assertEquals(hotel1.getTotalFreeRooms(day.getArrYear(), day.getArrMonth(), day.getArrDate()), 3);

	}
}
