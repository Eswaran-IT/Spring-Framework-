package beans;


public class Test {
	private static String name;
	private static String email;
	public static void setNameEmail(String name,String email) {
		Test.name = name;
		Test.email=email;
	}
	
	public static String getEmail() {
		return email;
	}
	public static String getName() {
		return name;
	}
	
	
}
