package hotelSearch;

import java.util.ArrayList;

 public interface QueryDB{
	 
	 ArrayList<Hotel> getMatchingHotelFromDB(String query) throws ConnectException;

}
