package beans;

public class Car 
{
	private String carname;
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void printCarData(){
		
		System.out.println("CarName="+carname);
	}

}
