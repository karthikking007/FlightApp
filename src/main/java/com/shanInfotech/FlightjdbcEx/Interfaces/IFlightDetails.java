package com.shanInfotech.FlightjdbcEx.Interfaces;

import com.shanInfotech.FlightjdbcEx.Entity.FlightDetails;

public interface IFlightDetails {
public void addFlight(FlightDetails fd) throws Exception;
public void updateFlight();
public void getFlight() throws Exception;
public void deleteFlight();

}
