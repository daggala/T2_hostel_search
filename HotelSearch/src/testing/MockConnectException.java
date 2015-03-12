package testing;

import java.util.ArrayList;

import hotelSearch.ConnectionDB;
import hotelSearch.Hotel;
import hotelSearch.ConnectException;
import hotelSearch.QueryDB;


public class MockConnectException implements QueryDB{
	
	
	public ArrayList<Hotel> getMatchingHotelFromDB(String query) throws ConnectException{
	 throw new ConnectException();
		
	}
		 
  
}