package beans;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	private String modelyear;
	private String fuelname;
	
	@Required
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}

	public void setFuelname(String fuelname) {
		this.fuelname = fuelname;
	}

	public String getFuelname() {
		return fuelname;
	}

	public String getModelyear() {
		return modelyear;
	}
}
