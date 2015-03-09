package hotelSearch;
import java.util.ArrayList;



public class HotelSearch {
	
	private ArrayList<Hotel> list = new ArrayList<Hotel>();
	private Request request;
	
	public ArrayList<Hotel> hotelSearch(Request request){
		
		//database query requests hotels that have the same location
		//and hotels that have availability for certain dates for certain amount of people
	
		this.request = request;
		//database query request.getLocation() etc...
		
		
		return list;
	}
}
