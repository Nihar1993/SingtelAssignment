package com.singtel.fish;

import com.singtel.Animal;
import com.singtel.action.Swimable;

public class Dolphin extends Animal implements Swimable {

	protected Dolphin(boolean ableToFly, boolean ableToSing, boolean ableToWalk, boolean ableToSwim) {
		super(ableToFly, ableToSing, ableToWalk, ableToSwim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		System.out.println("Dolphins are good swimmers");
	}

}
