package class12;
//create a new class
// java will save the file with class name like Car.java
public class Car {
//
	private String name;
	private String color;
	private String model;
	private int doors;
	private int wheels;
	private String engine;
	
	//To update the  field model with SetModel passing parameter 
	public void setModel(String model) {
		this.model=model;
	}
public String getModel() {
	return this.model;
}
}
