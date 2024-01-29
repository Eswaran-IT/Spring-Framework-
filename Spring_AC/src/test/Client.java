package test;


//Using Application Context
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"resources/test.xml");

		ap.getBean("t");
		ap.getBean("t");
		ap.getBean("t");
		System.out.println(ap);
		System.out.println();
		
	}
}
