package com.singtel;


import com.singtel.bird.Chicken;
import com.singtel.bird.Duck;
import com.singtel.bird.Parrot;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Bird chicken = Bird.ofType(CHICKEN);
		
		
		
		Parrot pr=new Parrot(false, false, false, false);
		pr.setSound("WOOFwoof");
		
		Chicken chk=new Chicken();
		
		chk.fly();
		chk.sing();
		Duck dck =new Duck();
		dck.swim();
		dck.sing();
		
		
		
		
		
	}

}
