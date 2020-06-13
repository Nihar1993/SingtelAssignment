package com.singtel.fish;

import com.singtel.action.Eatable;

public class Sharks extends Fish implements Eatable{


	public Sharks() {
		super("large", "grey");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Sharks eat other fishes");
	}

	

}
