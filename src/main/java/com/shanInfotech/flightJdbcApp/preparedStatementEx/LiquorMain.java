package com.shanInfotech.flightJdbcApp.preparedStatementEx;

import com.shanInfotech.flightJdbcApp.preparedStatementEx.dao.LiquorDao;

public class LiquorMain {

	public static void main(String[] args) throws Exception{
		LiquorDao ld=new LiquorDao();
		ld.addLiquorDetails();
}
}