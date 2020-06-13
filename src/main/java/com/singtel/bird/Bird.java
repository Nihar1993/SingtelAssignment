package com.singtel.bird;

import com.singtel.Animal;

public abstract class Bird extends Animal{
	Bird(boolean ableToFly, boolean ableToSing, boolean ableToWalk, boolean ableToSwim) {
		super(ableToFly,ableToSing,ableToWalk,ableToSwim);
	}
	
	public String  fly() {
		System.out.println("I am flying");
		return "I am flying";
	}
	
	public String sing() {
		System.out.println("I am Singing");
		return "I am Singing";
	}
}
