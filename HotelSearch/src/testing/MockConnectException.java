package testing;

import java.util.ArrayList;

import hotelSearch.Hotel;
import hotelSearch.ConnectException;
import hotelSearch.QueryDB;
import hotelSearch.Request;


public class MockConnectException implements QueryDB{
	
	
	public ArrayList<Hotel> getMatchingHotelsFromDB(Request request) throws ConnectException{
		throw new ConnectException();	
	}

	@Override
	public String makeQuery() {
		// TODO Auto-generated method stub
		return null;
	}  
}


 