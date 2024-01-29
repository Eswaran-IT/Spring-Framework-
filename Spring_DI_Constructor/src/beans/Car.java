package beans;

public class Car {
	private String carname;
	private String Brand;

	public Car(String carname,String Brand) {
		this.carname = carname;
		this.Brand=Brand;
		System.out.println("Constructor Called");
	}

	public void printCarData() {
		System.out.println("Brand-"+Brand);
		System.out.println("CarName=" + carname);
	}

}
