package hotelSearch;

public class Request {

	private String location;
	private StayLength day;
	private double totalBeds;

	public Request(String location, StayLength day, double totalBeds) {
		this.location = location;
		this.totalBeds = totalBeds;
		this.day = day;

	}

	public int getTotalBeds() {
		return (int) totalBeds;
	}

	public String getLocation() {
		return location;
	}

	public int getTotalRooms() {
		if (totalBeds == 1) {
			return 1;
		} else if (totalBeds <= 0) {
			return 0;
		} else if (totalBeds % 2 == 0) {
			return (int) (totalBeds / 2);
		} else if (totalBeds % 2 != 0) {
			return (int) Math.ceil(totalBeds / 2);
		} else {
			return 0;
		}
	}

	public StayLength getDate() {
		return day;
	}

}
