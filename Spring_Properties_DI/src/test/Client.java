package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.StudentDao;

public class Client {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");

	
	StudentDao stdao=(StudentDao)ap.getBean("stdao");
	System.out.println(stdao.getDriver());
	System.out.println(stdao.getUrl());
	System.out.println(stdao.getUser());
	System.out.println(stdao.getPwd());
}
}
