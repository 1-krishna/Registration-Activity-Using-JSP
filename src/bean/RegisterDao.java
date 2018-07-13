package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao {
	
	public static int register(User u){
		int status = 0;
		
		try{
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO USER_TABLE VALUES(?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			
			status = ps.executeUpdate();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return status;
	}

}
