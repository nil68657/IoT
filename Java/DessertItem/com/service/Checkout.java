package com.des.service;

import java.util.Iterator;
import java.util.Vector;

import com.asb.desert.DessertItem;
import com.asb.desert.DessertShoppe;
import com.desert.impl.Candy;
import com.desert.impl.Cookie;
import com.desert.impl.Sundae;

public class Checkout {
	Vector vc;
	int Totaalcost=0;
	DessertItem d0;
	DessertShoppe DS = new DessertShoppe();
	
	public Checkout(){
		vc = new Vector();		
	}
	void clear(){
		vc.clear();
	}
	public void enterItem(DessertItem obj){
		vc.addElement(obj);
	}
	public int totalCost(){
		Iterator itr = vc.iterator();
		while (itr.hasNext())
		{
			DessertItem d0 = (DessertItem) itr.next();
			Totaalcost = Totaalcost + d0.getCost();
		}		
		return Totaalcost;
	}
	
	public int Totaltax() {
	double ta;
	ta = (DS.TAX_RATE*Totaalcost)/100;
	return (int) ta;
	}
	
	public String toString() {
		String cost;
		String name;
		
		String str= String.format("%25s\n", "M & M Dessert Shoppe");
		str=str + String.format ("%25s\n" , "--------------------");
		Iterator itr = vc.iterator();
		while(itr.hasNext()){
			DessertItem d0 = (DessertItem) itr.next();
			cost = DessertShoppe.cents2dollarsAndCents(d0.getCost());
			name = d0.getName();
			str = str+ String.format("%5s %5s\n", name,cost);
			
			if (d0 instanceof Candy){
				String wt =  ((Candy) d0).getWeight() +"lbs" + "@" + ((Candy) d0).getPricePerPound() + "/lbs";
				str = str +  String.format("%5s \n", wt) ;
			}
			else if (d0 instanceof Cookie){
				String number = ((Cookie) d0).getNumber() + "@" + ((Cookie) d0).getPricePerDozen() + "/dozen" ;
				str = str + String.format("%5s \n", cost);
				
			}
			else if (d0 instanceof Sundae){
				String topping = ((Sundae)d0).getToppingName();
				str=str+String.format("%5s \n", topping);
			}
				str = str + String.format("%5s \n", "---------------------");
				String totalcost = DessertShoppe.cents2dollarsAndCents(totalCost() + Totaltax());
				String tax = DessertShoppe.cents2dollarsAndCents(Totaltax());
				str = str +	String.format("%5s %5s", "TAX" , tax);
				str = str + String.format("%5s %5s \n ", "Total Cost" , totalcost);
				
				return str;
		}
		return str;
	}
		
		public int numberOfItems(){
			return vc.size();
		}
		public String s() {
			// TODO Auto-generated method stub
			return null;
		}
		
				
				
				
			}
