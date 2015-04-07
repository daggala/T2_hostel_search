package hotelSearch;

import java.sql.*;
import java.util.ArrayList;

import org.joda.time.DateTime;

public class HotelSearch implements QueryDB{
	
	private ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	private ArrayList<Integer> IDs = new ArrayList<Integer>();
	private final String DB_DRIVER;
	private final String DB_CONNECTION;
	private String selectSQL;
	private Request request;
	private int priceGroup;
	private Facilities facs;
	public HotelSearch(){
		
		DB_DRIVER = "org.sqlite.JDBC";
<<<<<<< Updated upstream
		DB_CONNECTION = "jdbc:sqlite:/Users/Eyrun/git/HotelData";
=======
		DB_CONNECTION = "jdbc:sqlite:/Users/dagny/git/T2_hostel_search/HotelSearch/HotelData";
>>>>>>> Stashed changes
		this.selectSQL = "";
		this.request = request;
	}
	
	public String makeQuery(){
		
		StayLength staylength = request.getDate();
		ArrayList<String> dayList = staylength.getDatesOfStay();
		String selectSQL ="SELECT * FROM Hotels, Dates, Facilities "
	    		+ "WHERE Dates.hotelID=id AND Facilities.hotelID=id AND location=" + "\"" +
				request.getLocation() + "\" "; 
		
		PriceGroup pricegroup = request.getPriceGroup();
	    facs = request.getFacilities();
	    
	    boolean one = pricegroup.isInPricegroupOne();
	    boolean two = pricegroup.isInPricegroupTwo();
	   	boolean three = pricegroup.isInPricegroupThree();
	   	
	   	if(one == true && two == false && three == false){
	   		selectSQL= selectSQL + " AND pricegroup= 1";
	   	}
	   	if(one == false && two == true && three == false){
	    	selectSQL= selectSQL + " AND pricegroup= 2";
	    }
	   	if(one == false && two == false && three == true){
	   		selectSQL= selectSQL + " AND pricegroup= 3";
	   	}
	   	if(one == true && two == true && three == false){
    		selectSQL= selectSQL + " AND (pricegroup = 1 OR pricegroup= 2)";
    	}
	    if(one == false && two == true && three == true){
	   		selectSQL= selectSQL + " AND (pricegroup = 2 OR pricegroup= 3)";
	   	}
	   	if(one == true && two == false && three == true){
	   		selectSQL= selectSQL + " AND (pricegroup = 1 OR pricegroup= 3)";
    	}
	    	
	    
	    if(facs != null){
		    if(facs.isAlwaysOpen() == 1){
		    	selectSQL = selectSQL + " AND AlwaysOpen=1";
		    }
		    
		    if(facs.isBar() == 1){
		    	selectSQL = selectSQL + " AND Bar=1";
		    }
		    if(facs.isWifi() == 1){
		    	selectSQL = selectSQL + " AND Wifi=1";
		    }
		    if(facs.isEnsuite() == 1){
		    	selectSQL = selectSQL + " AND enSuite=1";
		    }
		    if(facs.isTV() == 1){
		    	selectSQL = selectSQL + " AND TV=1"; 
		    }
	    }
	    
	    for(int i = 0; i< staylength.getDuration(); i++){
		    selectSQL = selectSQL + " AND \"" + dayList.get(i) + "\"" + ">=" + request.getTotalRooms();
	    }
	    
	    selectSQL = selectSQL + ";";
	    
	    System.out.println(selectSQL);
	    return selectSQL;
	}
	
	public ArrayList<Hotel> getMatchingHotelsFromDB(Request request) throws ConnectException{

		this.request = request;
		String selectSQL = makeQuery();
		Connection c = null;
	    PreparedStatement statement = null;
	    
		    try {
		    
			      c = ConnectionDB.getDBConnection(DB_DRIVER, DB_CONNECTION);
			     
			      statement = c.prepareStatement(selectSQL);
		
			      ResultSet rs = statement.executeQuery();
			      
			      while ( rs.next() ) {
			    	  
			    	  int id = rs.getInt("id");
				      String name = rs.getString("name");
				      String location = rs.getString("location");
				      int pricegroup  = rs.getInt("pricegroup");
				      int pricePerNight  = rs.getInt("pricePerNight");
				      int alwaysopen = rs.getInt("AlwaysOpen");
				      int bar = rs.getInt("Bar");
				      int wifi = rs.getInt("Wifi");
				      int ensuite = rs.getInt("ensuite"); 
				      int tv = rs.getInt("TV");
				      
				      Facilities facs = new Facilities(alwaysopen, bar, wifi, ensuite, tv);
				      Hotel hotel = new Hotel(id, name, location, pricegroup, pricePerNight, facs);
				      
				 
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
		    
	    return hotels;	
	}



}
