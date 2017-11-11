package org.springcore;

public class Restaurant {
	String welcomeMsg;
	
	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}

	public void greetCustomer(){
		System.out.println(welcomeMsg);
	}
}
