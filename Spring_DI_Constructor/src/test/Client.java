package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;


public class Client {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car.xml");
	
		Car c=(Car)ap.getBean("c");
		Car d=(Car)ap.getBean("c");
			d.printCarData();
			c.printCarData();
	
}
}
