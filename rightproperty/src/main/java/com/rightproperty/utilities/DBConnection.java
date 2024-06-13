package com.rightproperty.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	  
	public static Connection connection=null;
	
	public static Connection getConnection() throws SQLException {
		if( connection!= null) {
			return connection;
		}
		
		else {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/nms";
			String user="root";
			String password="NNNNN";
			try {
				Class.forName(driver);
				connection=DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		return connection;
	}

}
