package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {
public static void main(String[] args) {
	
	//find xml
	Resource resource=new ClassPathResource("resources/test.xml");
	//load xml
	BeanFactory factory=new XmlBeanFactory(resource);
	Test t1=(Test)factory.getBean("hi");
	Test t2=(Test)factory.getBean("hi");
	Test t3=(Test)factory.getBean("hi");
	Test t4=(Test)factory.getBean("hi");
	
	System.out.println(t1.name);
	System.out.println(t1==t2);
	System.out.println(t2==t3);
	System.out.println(t3==t4);
	
	
	
}
}
