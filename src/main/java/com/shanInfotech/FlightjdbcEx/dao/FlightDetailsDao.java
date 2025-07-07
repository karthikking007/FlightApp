package com.shanInfotech.FlightjdbcEx.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.shanInfotech.FlightjdbcEx.DBConnect;
import com.shanInfotech.FlightjdbcEx.Entity.FlightDetails;
import com.shanInfotech.FlightjdbcEx.Interfaces.IFlightDetails;

public class FlightDetailsDao implements IFlightDetails{
Scanner sc=new Scanner(System.in);
Connection con=null;
Statement st=null;
ResultSet rs=null;
@Override
public void addFlight(FlightDetails fd) throws Exception {
	// TODO Auto-generated method stub
	con=DBConnect.Connect();
	con.setAutoCommit(false);
	st=con.createStatement();
	System.out.println("Flight Details: ID,FlightCompany,TravelDate,Source,Destination");
	fd.setFlightId(sc.nextInt());
	sc.nextLine();
	fd.setFlightCompany(sc.nextLine());
	fd.setTravelDate(sc.nextLine());
	fd.setSource(sc.nextLine());
	fd.setDestination(sc.nextLine());
	String insertFlights="insert into flightdetails values("+fd.getFlightId()+",'"+fd.getFlightCompany()+"','"
			+fd.getTravelDate()+"','"+fd.getSource()+"','"+fd.getDestination()+"')";
	st.executeUpdate(insertFlights);
	con.commit();
	System.out.println("Data Inserted");
	con.close();
	
}
@Override
public void updateFlight() {
	// TODO Auto-generated method stub
	
}
@Override
public void getFlight() throws Exception {
	con=DBConnect.Connect();
	st=con.createStatement();
	String queryResult="select * from flightdetails";// result set id used for fetching the data from the database
	rs=st.executeQuery(queryResult);
	while(rs.next()) {
		System.out.println("Flight Id: "+rs.getInt(1));
	}
}
@Override
public void deleteFlight() {
	// TODO Auto-generated method stub
	
}




}
