package Inheritaance;

public class FinalVariableDemo {
	final int speed=40;//final variable, so we can't change the value of variable.
	

	public static void main(String[] args) {
		FinalVariableDemo  fObj= new FinalVariableDemo();
		fObj.speed=100;//compile time error
		System.out.println(fObj.speed);

	}

}
