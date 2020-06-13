package com.singtel.bird;



public class Duck extends Bird  {
	
	public Duck() {
		super(false,true,false,true);
	}
	   
		public String sing(){
			System.out.println("Quack,quack");
			return "Quack,quack";
		}

		
		public String swim() {
			// TODO Auto-generated method stub
			System.out.println("A duck can Swim");	
			return "A duck can Swim";
		} 
}