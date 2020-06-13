package com.singtel.fish;

import com.singtel.action.Jokeable;

public class ClownFish extends Fish implements Jokeable{

	public ClownFish() {
		super("small", "orange");
	}
	@Override
	public void makeJokes() {
		// TODO Auto-generated method stub
		System.out.println("Clownfish Make jokes");
	}

}
