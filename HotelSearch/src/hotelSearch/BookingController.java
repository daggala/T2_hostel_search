package hotelSearch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookingController {
	
	private final String DB_DRIVER;
	private final String DB_CONNECTION;
	
	public BookingController(){
		DB_DRIVER = "org.sqlite.JDBC";
//<<<<<<< Updated upstream
		//DB_CONNECTION = "jdbc:sqlite:/Users/Eyrun/git/HotelData";
		DB_CONNECTION = "jdbc:sqlite:/Users/hrefnaolafsdottir/Skoladot/HI/SoftwareDevelopment/Verkefni/database/HotelData";
		
//=======
		//DB_CONNECTION = "jdbc:sqlite:/Users/dagny/git/T2_hostel_search/HotelSearch/HotelData";
//>>>>>>> Stashed changes
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