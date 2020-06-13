package com.singtel.bird;



public class Duck extends Bird  {
	
	public Duck() {
		super(false,true,false,true);
		super.setSound("Quack,quack");
	}

		
		public String swim() {
			// TODO Auto-generated method stub
			System.out.println("A duck can Swim");	
			return "A duck can Swim";
		} 
}