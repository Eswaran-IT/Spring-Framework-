package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car.xml");
	Car c1=(Car)ap.getBean("c");
	Car c2=(Car)ap.getBean("c");
	System.out.println(c1==c2);
	
	
}
}
