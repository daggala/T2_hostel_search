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
		
		String query_string = "SELECT * FROM Hotels WHERE location='";
		String location = request.getLocation();
		query_string = query_string + location +"';\"";
		return query_string;
		
	}

	
	public ArrayList<Hotel> findHotels(Request request){
		
		query_string = makeQueryString(request);
		
		try{
			list = queryDB.getMatchingHotelsFromDB(query_string);
		}
		
		catch(ConnectException e){
		}
	
		return list;
	}
}
