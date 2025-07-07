package com.shanInfotech.flightJdbcApp.preparedStatementEx;

public class LiquorBarren {
private int batchNo;
private String liquorType;
private String liquorName;
private String countryOrigin;
private  int years;
private double price;

public LiquorBarren() {
	
}

public LiquorBarren(int batchNo, String liquorType, String liquorName, String countryOrigin, int years, double price) {
	super();
	this.batchNo = batchNo;
	this.liquorType = liquorType;
	this.liquorName = liquorName;
	this.countryOrigin = countryOrigin;
	this.years = years;
	this.price = price;
	
}

public int getBatchNo() {
	return batchNo;
}

public void setBatchNo(int batchNo) {
	this.batchNo = batchNo;
}

public String getLiquorType() {
	return liquorType;
}

public void setLiquorType(String liquorType) {
	this.liquorType = liquorType;
}

public String getLiquorName() {
	return liquorName;
}

public void setLiquorName(String liquorName) {
	this.liquorName = liquorName;
}

public String getCountryOrigin() {
	return countryOrigin;
}

public void setCountryOrigin(String countryOrigin) {
	this.countryOrigin = countryOrigin;
}

public int getYears() {
	return years;
}

public void setYears(int years) {
	this.years = years;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
	
}

@Override
public String toString() {
	return "LiquorBarren [batchNo=" + batchNo + ", liquorType=" + liquorType + ", liquorName=" + liquorName
			+ ", countryOrigin=" + countryOrigin + ", years=" + years + ", price=" + price + "]";
}

}
