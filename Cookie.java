package com.desert.impl;

import com.asb.desert.DessertItem;

public class Cookie extends DessertItem{
	
	private double number;
	private double pricePerDozen;
	private String cookieName = getName();
	

	public Cookie( String cookieName, double number, double pricePerDozen) {
		super();
		this.number = number;
		this.pricePerDozen = pricePerDozen;
		this.cookieName = cookieName;
	}


	public double getNumber() {
		return number;
	}


	public void setNumber(double number) {
		this.number = number;
	}


	public double getPricePerDozen() {
		return pricePerDozen;
	}


	public void setPricePerDozen(double pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}


	@Override
	public int getCost() {
		int totalCost = (int) (getNumber()*getPricePerDozen());
		return totalCost;
	}

}
