package com.singtel.fish;

import com.singtel.action.Singable;
import com.singtel.action.Swimable;
import com.singtel.action.Walkable;

public class Fish implements Walkable,Singable,Swimable{
	
	public String sing(){
		System.out.println("Fishes Don't Sing");
		return "Fishes Don't Sing";
	}  

	
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Fishes can Swim");	
	} 
	public void walk(){
		System.out.println("Fishes Don't walk");
	}


	//2nd step
	String size;
	String colour;
	public Fish(String size, String colour) {
		this.size = size;
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}


	public String getColour() {
		return colour;
	}
	
}
