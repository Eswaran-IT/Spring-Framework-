package beans;

abstract public class Car implements Cloneable
{
	private static Car c;
	public static Car getCar(){
		if(c==null)
		{
			c=new CarC();
		return c;
		}
		else
		{
			return c;
		}	
	}
	public void drive(){
		System.out.println("SafeDriver upto 150km p/h");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	throw new CloneNotSupportedException();
	}
	

}
