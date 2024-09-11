package MethodExample;

public class CallingAStaticMethodInNonStaticMethodInClass {
// Create a static method
	static void method() {
		System.out.println(" I am static method");
	}
	
    void method1() {
    	method();
    	System.out.println(" I am non-static method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingAStaticMethodInNonStaticMethodInClass cr=new CallingAStaticMethodInNonStaticMethodInClass();
      cr.method1();
	}

}
