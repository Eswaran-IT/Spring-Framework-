package beans;

public class Test 
{
	String name;
	int age;
	public Test(String name)
	{
		System.out.println("Name constructor");
	this.name=name;
	}
	public Test(int age)
	{
		System.out.println("Age constructor");
	this.age=age;
	}
	public void printData(){
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
	
	
}
