package com.singtel.bird;

public class Parrot extends Bird {

	public Parrot(boolean ableToFly, boolean ableToSing, boolean ableToWalk, boolean ableToSwim) {
		super(ableToFly, ableToSing, ableToWalk, ableToSwim);
		// TODO Auto-generated constructor stub
		
	
	}
	public void stayingWithSound(String sound) {
		super.setSound(sound);
	}
}
