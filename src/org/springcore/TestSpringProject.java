package org.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/SpringConfig.xml");
		// we can also use bean factory instead application context
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaurant restaurantObj1 = (Restaurant) context.getBean("restaurantBean");
		
		restaurantObj1.prepareHotDrink();
		restaurantObj1.displayWaiters();
		
		Restaurant restaurantObj2 = (Restaurant) context.getBean("restaurantBean");
		restaurantObj2.setWelcomeMSG("Hello customer, welcome!");
		restaurantObj2.greetCust();
		Restaurant restaurantObj3 = (Restaurant) context.getBean("restaurantBean");
		restaurantObj3.greetCust();
		restaurantObj3.printValueFromPropFile();
	}
}