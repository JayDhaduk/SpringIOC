package com.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		System.out.println("welcome to  Mobile  class \n");
		
		// This is hard coded and its not recommended 
		
//		Airtel a = new Airtel();
//		a.calling(); a.internet();
//		
//		Vodafone v =new Vodafone();
//		v.calling(); v.internet();
		
		// interface can be used to hold Airtel and Vodafone class. This is polymorephism concept  
		Sim airtel = new Airtel();
		airtel.calling(); airtel.internet();
		
		//Now IOC container can create object for us. 
		System.out.println("\nNow IOC container can create object for us.");
		
		//Error Sol::https://stackoverflow.com/questions/12893760/spring-cannot-find-bean-xml-configuration-file-when-it-does-exist
		ApplicationContext  context = new ClassPathXmlApplicationContext("file:src/main/java/com/springIOC/beans.xml");
		
//		Vodafone vodafone = context.getBean("vodafone", Vodafone.class);
//		vodafone.calling();
//		vodafone.internet();
		
		Three three = context.getBean("three",Three.class);
		three.calling(); three.internet();
		
	}
}
