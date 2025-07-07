package com.shanInfotech.flightJdbcApp.preparedStatementEx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.shanInfotech.FlightjdbcEx.DBConnect;
import com.shanInfotech.flightJdbcApp.preparedStatementEx.interfaces.ILiquor;

public class LiquorDao implements ILiquor {
 private Connection con=null;
 private PreparedStatement ps=null;
 private ResultSet rs=null;
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void addLiquorDetails() throws Exception {
		// TODO Auto-generated method stub
		con=DBConnect.Connect();
		String insertLiq="insert into liquorBarren values(?,?,?,?,?,?)";// ? is known as in parameters
		ps=con.prepareStatement(insertLiq);
		System.out.println("Insert Liquor data");
		ps.setInt(1,sc.nextInt());
		sc.nextInt();
		ps.setString (2, sc.nextLine());
		ps.setString (3, sc.nextLine());
		ps.setString (4, sc.nextLine());
		ps.setInt (5, sc.nextInt());
		ps.setDouble (6, 100+Math.random());
		ps.execute();
		System.out.println("Data Inserted Successfully!! Cheeers");
		
		
	}

	@Override
	public void getLiquorDetails() {
		// TODO Auto-generated method stub
		
	}

}
