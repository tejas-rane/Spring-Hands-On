package org.springcore;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean,DisposableBean {
	HotDrink hotDrink;
	private List restaurentWaiters;
	String welcomeMSG;
	/*public Restaurant(HotDrink hotDrink) {
		super();
		this.hotDrink = hotDrink;
	}*/
	public void setWelcomeMSG(String welcomeMSG) {
		
		this.welcomeMSG = welcomeMSG;
	}
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
	public void greetCust(){
		System.out.println(welcomeMSG);
	}
	/*@PostConstruct
	public void init(){
		System.out.println("restaurant bean is initiated");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroying...");
	}*/
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from destroy() ");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from afterPropertiesSet ");
	}
	
}
