package com.shanInfotech.flightJdbcApp.examples.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.shanInfotech.FlightjdbcEx.DBConnect;
import com.shanInfotech.flightJdbcApp.examples.Toy;
import com.shanInfotech.flightJdbcApp.examples.interfaces.IToy;

public class ToyDao  implements IToy{
private Connection con=null;
private Statement st=null;
 private ResultSet rs=null;



	@Override
	public void addToy(Toy t) throws Exception {
		// TODO Auto-generated method stub
		con=DBConnect.Connect();
		st=con.createStatement();
		
		st.addBatch("insert into toy values(101,'spiderMan','India',7689.00)");
		st.addBatch("insert into toy values(102,'elephant','Chinna',6541.00)");
		st.addBatch("insert into toy values(103,'laughing buddha','USA',3200.00)");
		st.addBatch("insert into toy values(104,'chepattana pujari','India',4320.00)");
		st.addBatch("insert into toy values(105,'hulk','japan',5678.00)");
		int i[]=st.executeBatch();// the return type is array
		System.out.println("Data Inserted");
	}

	@Override
	public void updateToy() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void getToy() throws Exception {
		// TODO Auto-generated method stub
		con=DBConnect.Connect();
		st=con.createStatement();
		String queryRs="select toyId,toyName,(toyPrice-(toyprice*.15)) as newToyPrice from toy";
		rs=st.executeQuery(queryRs);
		while(rs.next()) {
			// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getDouble("newToyPrice));
			System.out.printf("\n %d,%s,%.1f",rs.getInt(1),rs.getString(2),rs.getDouble(3));
		}
	}

}
