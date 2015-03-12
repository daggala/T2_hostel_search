package hotelSearch;
import java.util.ArrayList;

public class HotelSearch {
	
	private QueryDB queryDB;
	private Request request;
	private String query;
	private ArrayList<Hotel> list;
			
	public HotelSearch(QueryDB queryDB){
		this.queryDB = queryDB;
	
	}
	
	public String makeQueryString(){
		request.getLocation();
		///etc...
		query="SQL_QUERY";
		return query;
	}
	
	public ArrayList<Hotel> findHotels(Request request){
		
		query = makeQueryString();
		
		try{
			list = this.queryDB.getMatchingHotelFromDB(query);
		}
		
		catch(ConnectException e){
		}
		
		
		return list;
	}
}
