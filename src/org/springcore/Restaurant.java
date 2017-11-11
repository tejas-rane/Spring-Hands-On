package org.springcore;

import java.util.List;

public class Restaurant {
	HotDrink hotDrink;
	private List restaurentWaiters;
	/*public Restaurant(HotDrink hotDrink) {
		super();
		this.hotDrink = hotDrink;
	}*/
	
	public void setHotDrink(HotDrink hotDrink) {
		
		this.hotDrink = hotDrink;
	}
	
	public void setRestaurentWaiters(List restaurentWaiters) {
		this.restaurentWaiters = restaurentWaiters;
	}
	
	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
	}
	public void displayWaiters(){
		System.out.println("All waiters working in rest are " + restaurentWaiters);
	}
	
}
