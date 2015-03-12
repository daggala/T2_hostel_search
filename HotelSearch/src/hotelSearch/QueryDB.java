package hotelSearch;

import java.util.ArrayList;

 public interface QueryDB{
	 
	 //should there be getMockHotel() method here? but then the class
	 //ConnectionDB also has to implement the method getMockHotel();
	 ArrayList<Hotel> getMatchingHotelFromDB(String query) throws ConnectException;

}
