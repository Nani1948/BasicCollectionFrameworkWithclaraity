package Method.Static;

public class CallingAStaticMethodInsidePSVM {
	static void add() {
	    System.out.println("I am add");	  
	  }
	  static void add1() {
		System.out.println("I am add1");  
	  }
	  static void add2() {
		System.out.println("I am add2");  
	  }
	  static void add3() {
		System.out.println("I am add3");  
	  }
	  static void add4() {
		System.out.println("I am add4");  
	  }
	  static void add5() {
		System.out.println("I am add5");  
	  }
	public static void main(String[] args) {
		System.out.println("I am main method");
	    add();
	    add1();
	    add2();
	    add3();
	    add4();
	    add5();
	}

}
