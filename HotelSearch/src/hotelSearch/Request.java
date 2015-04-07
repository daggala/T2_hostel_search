package hotelSearch;

import java.util.ArrayList;

public class Request {
	
	private String location;
	private StayLength stayLength;
	private double totalBeds;
	private Facilities facs;
	private PriceGroup priceGroup;
	
	public Request(String location, StayLength day, Double totalBeds){
		this.location = location;
		this.totalBeds = totalBeds;
		this.stayLength = day;
		this.facs = null;
		this.priceGroup = null;
	}
	
	public int getTotalBeds(){
		return (int) totalBeds;
	}
	
	public String getLocation(){
		return location;
	}
	
	public Facilities getFacilities(){
		return facs;
	}
	
	public PriceGroup getPriceGroup(){
		return priceGroup;
	}
	
	public int getTotalRooms(){
		if (totalBeds == 1) {
			
			return 1;
		}
		else if (totalBeds <= 0){
			return 0;
		}
		else if (totalBeds%2 == 0) { 
			return (int) (totalBeds/2); 
		} 
		else if (totalBeds%2 != 0) { 
			return (int) Math.ceil(totalBeds/2);
		}
		else{
			return 0;
		} 
	}
	
	public StayLength getDate(){
		return stayLength;
	}

	public void addPriceGroup(PriceGroup pricegroup){
		this.priceGroup = pricegroup; 
	}
	
	public void addFacilities(Facilities facs){
		this.facs = facs;
	}
	

}
