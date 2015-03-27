package hotelSearch;

import java.sql.*;
import java.util.ArrayList;

import org.joda.time.DateTime;

public class HotelSearch implements QueryDB {
	
	private ArrayList<Hotel> hotels = new ArrayList<Hotel>();

	ArrayList<Integer> facs = new ArrayList<Integer>();
	
	private final String DB_DRIVER;
	private final String DB_CONNECTION;
	
	public HotelSearch(){
		
		DB_DRIVER = "org.sqlite.JDBC";
		DB_CONNECTION = "jdbc:sqlite:/Users/dagny/Documents/HotelSearch/T2_hostel_search/HotelSearch/HotelData";
		
	}
	
	public ArrayList<Hotel> getMatchingHotelsFromDB(Request request) throws ConnectException{

		Connection c = null;
	    PreparedStatement statement = null;
	    
	    ArrayList<String> dayList = new ArrayList<String>();
	    StayLength staylength = request.getDate();
	    dayList = staylength.getDatesOfStay();
	
	    staylength.getDaysBetweenDates();
	    //String selectSQL= "SELECT * FROM Hotels, Dates WHERE \"010615\"=176 AND HotelID = id AND location=?;";
	    
	    for(int i=0; i< staylength.getDaysBetweenDates(); i++)
	    {
	    	
		    String selectSQL="SELECT * FROM Hotels, Dates, Facilities WHERE" + " \"" + dayList.get(i) + 
		    		"\""+  ">=176 AND location=? AND Facilities.hotelID = id AND Dates.hotelID = id;";

		    try {
		    
			      //Class.forName(DB_DRIVER);
			      c = ConnectionDB.getDBConnection(DB_DRIVER, DB_CONNECTION);
			      
			      statement = c.prepareStatement(selectSQL);
			      
			      statement.setString(1, request.getLocation());
			  
			      ResultSet rs = statement.executeQuery();
			      
			      while ( rs.next() ) {
			    	  
			    	  int id = rs.getInt("id");
				      String name = rs.getString("name");
				      String location = rs.getString("location");
				      int pricegroup  = rs.getInt("pricegroup");
				      int pricePerNight  = rs.getInt("pricePerNight");
				      facs.add(rs.getInt("24HourReception"));
				      facs.add(rs.getInt("Bar"));
				      facs.add(rs.getInt("Wifi"));
				      facs.add(rs.getInt("ensuite"));
				      facs.add(rs.getInt("TV"));
				      
				      Hotel hotel = new Hotel(id, name, location, pricePerNight, facs);
			         
				      hotels.add(hotel);
			      }
			      
		      rs.close();
		      statement.close();
		      c.close();
		    }
		    
		    catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
	    
	    }
	   
	    return hotels;	
	}

	private void add(boolean boolean1) {
		// TODO Auto-generated method stub
		
	}
}
