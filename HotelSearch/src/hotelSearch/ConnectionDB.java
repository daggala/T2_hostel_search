package hotelSearch;

import java.util.ArrayList;

public class ConnectionDB implements QueryDB {

	private ArrayList<Hotel> hotels;

	public ConnectionDB(){
		
	}

	public ArrayList<Hotel> getMatchingHotelFromDB(String query) throws ConnectException{

		return hotels;
	}

}
