package consumefromoneclassintoanotherclasswithoutInheritance;

public class ClassAbc {
	 static void multiplication1(){
		 int a=10;
		 int b=20;
		 System.out.println(a*b);
	 }
	 //Non-static method
	void division() { 
	 int a=10;
	 int b=20;
	System.out.println(a/b);
	 }
	
	public static void main(String[] args) {
		
      multiplication1();
      ClassAbc ca=new ClassAbc();
      ca.division();
      //Creation of object of anotherclass(Xyz)
      //1.Create an object 
      //2.Calling reference with their static method name or non-static method.
      Xyz x=new  Xyz();
      x.subtraction();
      x.addition();
      
	}

}
