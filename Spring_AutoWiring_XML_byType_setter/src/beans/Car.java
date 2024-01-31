package beans;

public class Car {
private Engine engine;

public void setEngine(Engine engine) {
System.out.println("setEng called");
	this.engine = engine;
}
public void printData(){
	System.out.println("ModelYear="+engine.getModelyear());
}


}
