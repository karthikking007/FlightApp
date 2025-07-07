package com.shanInfotech.FlightjdbcEx;

import com.shanInfotech.FlightjdbcEx.dao.FlightDetailsDao;

public class App {
    public static void main(String[] args) throws Exception {
      FlightDetailsDao fd=new FlightDetailsDao();
     // FlightDetails fde=new FlightDetails();
     // fd.addFlight(new FlightDetails());
      fd.getFlight();
    }
}
