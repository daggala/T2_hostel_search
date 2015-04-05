package hotelSearch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookingManager {
	
	private final String DB_DRIVER;
	private final String DB_CONNECTION;
	
	public BookingManager(){
		DB_DRIVER = "org.sqlite.JDBC";
		DB_CONNECTION = "jdbc:sqlite:/Users/dagny/Documents/HotelSearch/T2_hostel_search/HotelSearch/HotelData";
	}			
	
	public void reduceAvailability(Hotel hotel, Request request) throws ConnectException{

		Connection c = null;
		
	    PreparedStatement statement = null;
	    
	    ArrayList<String> dayList = new ArrayList<String>();
	    StayLength staylength = request.getDate();
	    dayList = staylength.getDatesOfStay();
	
	    
	    for(int i=0; i< staylength.getDuration(); i++)
	    { 
	    	
		    String updateSQL="UPDATE Dates SET \"" + dayList.get(i) + "\"=\"" + dayList.get(i) + "\"-? WHERE hotelID=?;";
		   
		    System.out.println(updateSQL);

		    try {
		    	
			      c = ConnectionDB.getDBConnection(DB_DRIVER, DB_CONNECTION);
	
			      statement = c.prepareStatement(updateSQL);
			     
			      
			      statement.setString(1, Integer.toString(request.getTotalRooms()));
			      
			 
			      statement.setInt(2, hotel.getHotelID());
			  	
	
			      statement.executeUpdate();
		
		      statement.close();
		      c.close();
		    }
		    
		    catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    } 
	    } 
	}
}