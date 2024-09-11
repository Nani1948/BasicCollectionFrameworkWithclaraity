package Method.StaticAndNonStatic;
public class CreatingAMultipleStaticMethodAndNonStaticMethod {

	static int addition( int a ,int b) {
		return a+b;
	}
	public static double subtraction(float f, double d) {
		return f-d;
	}
	public static void division() {
		int c=20;
		int d=10;
		System.out.println(c/d);
	}
	
	void printTheLeapYear(int n) {
	   if(n%4==0) {
		   System.out.println("This is leap year");
	   }
	   else
	   {
		   System.out.println("This is not leap year");
	   }
	}
	void multiplication() {
	 int x=41;
	 int y=20;
			 System.out.println(x*y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.calling a static method
		System.out.println(addition(10,20));
		System.out.println(subtraction(12.10f,2.02));
		division();
		// 2.Calling a non -static method
		
		CreatingAMultipleStaticMethodAndNonStaticMethod ct=new CreatingAMultipleStaticMethodAndNonStaticMethod();
		ct.printTheLeapYear(2009);
		ct.multiplication();
		
		
		
		
		
		
		
		
		
		
	}

}
