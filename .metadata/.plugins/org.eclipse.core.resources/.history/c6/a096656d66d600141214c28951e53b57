package hotelSearch;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConnectionDB{
	
	String driver;
	String connection;
	
	public ConnectionDB(){
		this.driver = driver;
		this.connection = connection;
	}
	
	static Connection getDBConnection(String driver, String connection) {
		 
		Connection dbConnection = null;
 
		try {
 
			Class.forName(driver);
 
		} catch (ClassNotFoundException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		try {
 
			dbConnection = DriverManager.getConnection(connection);
			return dbConnection;
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		return dbConnection;
 
	}

}
