package beans;

public class CarFactory {

	private String carname;

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public Car getCar() throws Exception {
		Car c = (Car) Class.forName(carname).newInstance();
		return c;
	}

}
