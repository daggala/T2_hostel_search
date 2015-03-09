package hotelSearch;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.Days;


public class Request {
	
	private String location;
	private String fromDate;
	private String toDate;
	private int totalBeds;
	private int priceGroup;
	private ArrayList facilities;
	private StayLength day;
	private DateTime start;
	private DateTime end;
	
	public Request(String location, StayLength day, int totalBeds){
		this.location = location;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.totalBeds = totalBeds;
		this.day = day;
	}
	
	public int getTotalBeds(){
		return totalBeds;
	}
	
	public String getLocation(){
		return location;
	}
	
	public String getFromDate(){
		return this.fromDate;
	}
	
	public String getToDate(){
		return this.toDate;
	}
	
	
	public int getTotalRooms(){
		if (totalBeds < 2) {
			return 1;
		}
		if (totalBeds%2 == 0 && totalBeds > 2) { 
			return totalBeds/2; 
		} 
		else if (totalBeds%2 != 0) { 
			return (int) Math.ceil(totalBeds/2); 
		}
		else{
			return 0;
		} 
	}
	
	//Hvort meikar meira sense að reikna dagana út hér eða í Days?
	 
	/* 
	public int calcDays(){
		
		start = new DateTime(day.getArrYear(), day.getArrMonth(), day.getArrDate(), 0, 0);
		end = new DateTime(day.getDepYear(), day.getDepMonth(), day.getDepDate(), 0, 0);
				
		Days d = Days.daysBetween(start, end);
		int days = d.getDays();
		
		return days;
	
	}
	*/
	
	
}
