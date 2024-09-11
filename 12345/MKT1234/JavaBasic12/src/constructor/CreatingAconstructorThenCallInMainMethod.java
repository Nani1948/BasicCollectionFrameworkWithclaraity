package constructor;

public class CreatingAconstructorThenCallInMainMethod {
//1.Create a constructor
	 CreatingAconstructorThenCallInMainMethod(){
	System.out.println(" I am constructor");
}
	public static void main(String[] args) {
	// Create a object and constructor will be invoked atthe time of object creation
		 CreatingAconstructorThenCallInMainMethod ct=new  CreatingAconstructorThenCallInMainMethod();
	}

}
