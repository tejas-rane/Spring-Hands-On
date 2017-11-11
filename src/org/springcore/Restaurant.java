package org.springcore;

public class Restaurant {
	HotDrink hotDrink;

	/*public Restaurant(HotDrink hotDrink) {
		super();
		this.hotDrink = hotDrink;
	}*/
	
	public void setHotDrink(HotDrink hotDrink) {
		
		this.hotDrink = hotDrink;
	}
	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
	}
}
