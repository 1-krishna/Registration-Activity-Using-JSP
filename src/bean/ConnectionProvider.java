package bean;

import java.sql.Connection;
import java.sql.DriverManager;

import static bean.Provider.*;

public class ConnectionProvider {
	private static Connection con = null;
	static{
		try{
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection(){
		return con;
	}
}
