package hotelSearch;

import java.sql.*;
import java.util.ArrayList;

public class ConnectionDB implements QueryDB {

	// LLALALA

	private ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	int id;
	String name;
	String location;
	int pricegroup;
	int pricePerNight;
	ArrayList<String> facs = new ArrayList<String>();

	public ConnectionDB() {

	}

	public ArrayList<Hotel> getMatchingHotelsFromDB(String query)
			throws ConnectException {

		facs.add("TV");

		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager
					.getConnection("jdbc:sqlite:/Users/dagny/Downloads/database/HotelData");
			c.setAutoCommit(false);

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				id = rs.getInt("id");
				name = rs.getString("name");
				location = rs.getString("location");
				pricegroup = rs.getInt("pricegroup");
				pricePerNight = rs.getInt("pricePerNight");

				Hotel hotel = new Hotel(id, name, location, pricePerNight, facs);

				hotels.add(hotel);

			}

			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		return hotels;

	}

}
