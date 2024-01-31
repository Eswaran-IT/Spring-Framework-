package beans;

import org.springframework.beans.factory.annotation.Required;

public class Car {
private Engine engine;
private String carname;
public void setCarname(String carname) {
	this.carname = carname;
}
@Required
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void printData(){
	System.out.println("CarName="+carname);
	System.out.println("Engine="+engine.getModelyear());
}

}
