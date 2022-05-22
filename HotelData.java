package HotelManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelData  {
	

	
	private final String USER="root";
	private final String PASSWORD="1220";
	private final String DBURL="jdbc:mysql://localhost:3306/hotelbase?autoReconnect=true&useSSL=false";
	//private final String url = 
	
	public void data(String name,String contact,String gender,String name2,String contact2,String gender2) throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.cj.jdbc.Driver");        //Register Driver
		Connection conn = DriverManager.getConnection(DBURL,USER,PASSWORD); /// GetConnection To DB
		
		//Connection conn = DriverManager.getConnection(DBURL,USER,PASSWORD);
		PreparedStatement ps = conn.prepareStatement("insert into HotelD2 values(?,?,?,?,?,?)");
	    ps.setString(1,name);
	    ps.setString(2, contact);
	    ps.setString(3, gender);
	    
	    ps.setString(4,name2);
	    ps.setString(5, contact2);
	    ps.setString(6, gender2);
	    
		ps.executeUpdate();
	    System.out.println("Data Stored in DataBase Successfully");
         
	   
	}
		
		
	
	

}
