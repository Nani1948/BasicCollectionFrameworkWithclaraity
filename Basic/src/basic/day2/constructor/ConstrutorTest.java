package basic.day2.constructor;

public class ConstrutorTest {
	public static void main(String []args) {
	StudentCons ob=new StudentCons();
	System.out.println(ob.name);
	//At that time of creating an object, we can initalised value to those attributes.
	StudentCons ob1=new StudentCons();
	System.out.println(ob1.name);
	StudentCons ob2=new StudentCons(11,"john",30);
	System.out.println(ob2.name);
	StudentCons ob3=new StudentCons(11,"Hari",30);
	System.out.println(ob3.name);
	}	
}
