package com.shanInfotech.FlightjdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static Connection con=null;//connection interface used for connecting to data
	public static Connection Connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");// we are using type 4 driver and loading driver
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcex","root","root");
		 return con;
	}
}
