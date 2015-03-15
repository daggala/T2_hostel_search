package hotelSearch;
import java.util.ArrayList;

public class HotelSearch {
	
	private QueryDB queryDB;
	private String query_string;
	private ArrayList<Hotel> list;
			
	public HotelSearch(QueryDB queryDB){
		this.queryDB = queryDB;
		query_string ="";
	
	}
	
	public String makeQueryString(Request request){
		
		return query_string;
	}
	
	public ArrayList<Hotel> findHotels(Request request){
		
		query_string = makeQueryString(request);
		
		try{
			list = queryDB.getMatchingHotelFromDB(query_string);
		}
		
		catch(ConnectException e){
			list = new ArrayList<Hotel>();
		}
		
		
		return list;
	}
}
