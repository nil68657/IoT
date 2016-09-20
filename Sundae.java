package com.desert.impl;

public class Sundae extends IceCream {
	private double cost1;
	private String ToppingName;
	private double cost;
		

	public Sundae(String IceCreameName, double cost,String ToppingName, double cost1) {
		super(ToppingName, cost);
		this.cost = cost;
		this.ToppingName = ToppingName;
	}

	
	@Override
	public int getCost() {
		return (int) (cost1);
	}
		public String getToppingName(){
			return ToppingName;
		}
	public void setToppingName (String ToppingName){
		this.ToppingName = ToppingName;
	}

}
