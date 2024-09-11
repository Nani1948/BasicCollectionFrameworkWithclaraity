package MethodExample;

public class CreatingMethodOverloading {
	//Static method
	static void addition(){
	System.out.println(" I am addition");
	}

	static void addition(int a, int b){
	 System.out.println(a+b);
	}
	static void addition(String s){
	System.out.println(s);
	}
	//non-static method
	void addition(double d, float f){
	 System.out.println(d+f);
	}
	void addition(long l, short s){
	 System.out.println(l+s);
	}

	public static void main(String[] args) {
		//Calling a static method through static method by passing the parameter
		addition( 1,4);
		addition("MethodOverloading");
		//Calling a non-static method 
		//1.creating an object and 
		//2.calling a reference variable through non-static method name.
		CreatingMethodOverloading  mo1=new CreatingMethodOverloading();
		mo1.addition(1222222, 32000);


	}


}
