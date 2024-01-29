package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
	public static void main(String[] args) {
String xml_files[]=new String[]{"resources/car.xml","resources/engine.xml"};
	
ApplicationContext ap = new ClassPathXmlApplicationContext(xml_files);
		Car c1=(Car)ap.getBean("c1");
		c1.printCarData();
		Car c2=(Car)ap.getBean("c2");
		c2.printCarData();
	}
}
