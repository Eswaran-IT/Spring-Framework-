package beans;

public class Car 
{
	private String carname;
	private Engine engine;
	
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printCarData(){
		System.out.println("CarName="+carname );
		System.out.println("EngineName="+engine.getEnginename());
	}

}
