package testing;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;


public class Request {
	
	private String location;
	private String fromDate;
	private String toDate;
	private int totalBeds;
	private int priceGroup;
	private ArrayList facilities;
	
	
	public Request(String location, String fromDate, String toDate, int totalBeds){
		this.location = location;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.totalBeds = totalBeds;
	}
	
	public int getTotalBeds(){
		return totalBeds;
	}
	
	public String getLocation(){
		return location;
	}
	
	public long calcDays(){
		
		Date fromDate = new Date();
		Date toDate = new Date();
	
		SimpleDateFormat td = new SimpleDateFormat (this.fromDate);
      	SimpleDateFormat fd = new SimpleDateFormat (this.toDate);
      	long dagur2= toDate.getTime();
      	long dagur1 = fromDate.getTime();
      	long calc = dagur2-dagur1;
      	
      	return dagur1;
      	
      	//long diffDays = calc / (24 * 60 * 60 * 1000);
		//return diffDays;
 

		//return (int) (diff / (24 * 60 * 60 * 1000));
 
	}
}
