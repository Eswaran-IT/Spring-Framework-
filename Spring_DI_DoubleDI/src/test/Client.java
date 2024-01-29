package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
//Two ways of DI by xml
public class Client {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"resources/test-innerbean.xml");
		Car c1=(Car)ap.getBean("c1");
		c1.printCarData();
		/*Car c2=(Car)ap.getBean("c2");
		c2.printCarData();*/
	}
}
