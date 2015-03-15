package hotelSearch;

public class Request {
	
	private String location;
	private int totalBeds;
	
	public Request(String location, StayLength day, int totalBeds){
		this.location = location;
		this.totalBeds = totalBeds;

	}
	
	public int getTotalBeds(){
		return totalBeds;
	}
	
	public String getLocation(){
		return location;
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

}
