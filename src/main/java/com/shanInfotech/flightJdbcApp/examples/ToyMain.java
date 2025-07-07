package com.shanInfotech.flightJdbcApp.examples;

import com.shanInfotech.flightJdbcApp.examples.dao.ToyDao;

public class ToyMain {

public static void main(String[] args) throws Exception {
	ToyDao td=new ToyDao();
	//td.addToy(new Toy());
	td.getToy();
}
}
