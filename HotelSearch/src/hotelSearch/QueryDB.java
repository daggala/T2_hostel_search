package hotelSearch;

import java.util.ArrayList;

 public interface QueryDB{
	 
	 ArrayList<Hotel> getMatchingHotelsFromDB(Request request) throws ConnectException;

	 String makeQuery();



}
