package hotelSearch;

import java.util.ArrayList;

public class HotelSearch {

	private QueryDB queryDB;
	private String query_string;
	private ArrayList<Hotel> list;

	public HotelSearch(QueryDB queryDB) {
		this.queryDB = queryDB;
		query_string = "";

	}

	public String makeQueryString(Request request) {

		// SELECT * FROM Hotels, Dates WHERE hotelId=id AND location="Reykjavik"
		// AND "010615" >= 2;

		String query_string = "SELECT * FROM Hotels, Dates WHERE hotelID=id AND location='";

		String location = request.getLocation();
		StayLength day = request.getDate();

		String arrYear = Integer.toString(day.getArrYear());
		String arrMonth = Integer.toString(day.getArrMonth()); // skilar ekki
																// með 0 fyrir
																// framan
		String arrDay = Integer.toString(day.getArrDay()); // skilar ekki með 0
															// fyrir framan
		int totalRooms = request.getTotalRooms();

		String arrDate = "\"" + arrDay + arrMonth + arrYear + "\" >=";

		query_string = query_string + location + "' AND " + arrDate
				+ totalRooms + ";";

		return query_string;

	}

	public ArrayList<Hotel> findHotels(Request request) {

		query_string = makeQueryString(request);

		try {
			list = queryDB.getMatchingHotelsFromDB(query_string);
		}

		catch (ConnectException e) {
		}

		return list;
	}
}
