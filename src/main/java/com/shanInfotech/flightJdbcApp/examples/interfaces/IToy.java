package com.shanInfotech.flightJdbcApp.examples.interfaces;

import com.shanInfotech.flightJdbcApp.examples.Toy;

public interface IToy {
public void addToy(Toy t) throws Exception;
public void updateToy();
public void getToy() throws Exception;
}
