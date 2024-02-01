package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/test.xml");
	
	System.out.println(Test.getName());
	System.out.println(Test.getEmail());
	
	
}
}
