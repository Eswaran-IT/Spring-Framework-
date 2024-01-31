package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DDao;

public class Client {
public static void main(String[] args) {
	
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/test.xml");

	DDao dao=(DDao)	ap.getBean(DDao.class);
	dao.printCPDATA();
	
}
}
