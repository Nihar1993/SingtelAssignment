package com.singtel.bird;

import com.singtel.Animal;

public class Bird extends Animal{
	public void fly() {
		System.out.println("I am flying");
	}
	
	public String sing() {
		System.out.println("I am Singing");
		return "I am Singing";
	}
}
