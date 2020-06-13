package com.singtel;

public class Animal {
	private boolean ableToFly;
	private boolean ableToSing;
	private boolean ableToWalk;
	private boolean ableToSwim;
	
	protected Animal(boolean ableToFly, boolean ableToSing, boolean ableToWalk, boolean ableToSwim) {
		this.ableToFly = ableToFly;
		this.ableToSing = ableToSing;
		this.ableToWalk = ableToWalk;
		this.ableToSwim = ableToSwim;
	}

	public boolean isAbleToFly() {
		return ableToFly;
	}

//	protected void setAbleToFly(boolean ableToFly) {
//		this.ableToFly = ableToFly;
//	}

	public boolean isAbleToSing() {
		return ableToSing;
	}

//	protected void setAbleToSing(boolean ableToSing) {
//		this.ableToSing = ableToSing;
//	}

	public boolean isAbleToWalk() {
		return ableToWalk;
	}

//	protected void setAbleToWalk(boolean ableToWalk) {
//		this.ableToWalk = ableToWalk;
//	}

	public boolean isAbleToSwim() {
		return ableToSwim;
	}

//	protected void setAbleToSwim(boolean ableToSwim) {
//		this.ableToSwim = ableToSwim;
//	}

	public void walk() {
		System.out.println("I am walking");
	}

}
