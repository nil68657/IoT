package com.desert.impl;

import com.asb.desert.DessertItem;

public class Candy extends DessertItem{
	
	private double weight;
	private double pricePerPound;
    private String candyName = getName();
	

	public Candy(String candyName, double weight, double pricePerPound) {
		super();
		this.weight = weight;
		this.pricePerPound = pricePerPound;
		this.candyName = candyName;
	}




	public double getWeight() {
		return weight;
	}




	public void setWeight(double weight) {
		this.weight = weight;
	}




	public double getPricePerPound() {
		return pricePerPound;
	}




	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}




	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int totalCost = (int) (getWeight()*getPricePerPound());
		return totalCost;
	}

}
