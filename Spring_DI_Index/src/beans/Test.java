package beans;

public class Test 
{
	String name;
	String email;
public Test(String name,String email) 
{
this.name=name;
this.email=email;
}
	
public void printData(){
	System.out.println("Name="+name);
	System.out.println("Email="+email);
}
	
	
}
