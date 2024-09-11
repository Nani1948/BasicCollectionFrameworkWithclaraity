package MethodExample;

public class CallingBothStaticAndNonStaticMethod {
    static void addition() {
    	int a=10;
    	int b=20;
    	System.out.println(a+b);
    }
    static void subtraction() {
    	int a=10;
    	int b=20;
    	System.out.println(a-b);
    }
    void multiplication() {
    	int a=10;
    	int b=20;
    	System.out.println(a*b);
    }
    void division() {
    	int a=40;
    	int b=10;
    	System.out.println(a/b);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
addition();
subtraction();
CallingBothStaticAndNonStaticMethod c1=new CallingBothStaticAndNonStaticMethod();
c1.multiplication();
c1.division();


	
	}

}
