package Method.NonStatic;

public class CreatingANonStaticMethod {
	// Create a  non-static method
	void addition() {
	    	int a=10;
	    	int b=20;
	    	System.out.println(a+b);
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        // calling a non- static method 
	//1.Create an object
	CreatingANonStaticMethod ct=new CreatingANonStaticMethod();
	//2.Calling a reference variable with non static method name
	ct.addition();




		}
}
