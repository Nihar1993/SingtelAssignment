package com.singtel.bird;



public class Chicken extends Bird {
	
	public Chicken() {
		super(false,true,true,false);
		super.setSound("Cluck,Cluck");
	}

	
	public String fly() {
		// TODO Auto-generated method stub
		System.out.println("A chicken Can not fly");
		return "A chicken Can not fly";
	}
}
