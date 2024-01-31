package beans;

public class Car {
private Engine engine;

public Car(Engine engine) {
	System.out.println("Constructor called");
	this.engine=engine;
}

public void printData(){
	System.out.println("ModelYear="+engine.getModelyear());
}


}
