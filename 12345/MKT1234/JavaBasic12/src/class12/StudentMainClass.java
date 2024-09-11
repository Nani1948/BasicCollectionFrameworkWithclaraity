package class12;

public class StudentMainClass {

	public static void main(String[] args) {
		//-3Constructor will be invoked at the time object creation with values
		StudentClass s1=new StudentClass(1010,"john",'A');
		//Assign values through reference variable-1.
		/*s1.sid=1010;
		s1.sname="John";
		s1.grade='A';*/
		
		//Assign value by using method-2.
        //s1.getValues(1011,"Nani",'B');
		
		s1.display();

	}

}
