package Method.NonStatic;

public class NonStaticMethod {
    static void add() 
    {
      System.out.println("I am a static method");
    }
    void subtract() {
      System.out.println("I am a non-static method");	
    }
	public static void main(String[] args) 
	{
	   add();
	   subtract();//   you will compilation issue due to you haven't create an object
	   // To avoid this, we used to create an object.
	   //you create an object then with reference variable , you can call non-static method name.
	   NonStaticMethod n=new NonStaticMethod();
	   n.subtract();
	   System.out.println("hello");
	}

}
