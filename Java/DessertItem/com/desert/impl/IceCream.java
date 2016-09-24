package com.desert.impl;

import com.asb.desert.DessertItem;

public class IceCream extends DessertItem{
	
	private double cost;
	private String IceCream = getName();
	private String IceCreamName;
	

	public IceCream( String IceCreameName, double cost) {
		super();
		this.cost = cost;
		this.IceCreamName = IceCreameName;
	}


	public double getcost() {
		return cost;
	}


	public void setcost(double number, double cost) {
		this.cost = cost;

	}


	@Override
	public int getCost() {
		int totalCost = (int) (cost);
		return totalCost;
	}

}
