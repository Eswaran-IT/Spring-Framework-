package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

//using xml config the dependency injected

public class Client {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car.xml");
	
		Car c=(Car)ap.getBean("c");
			c.printCarData();
	
}
}
