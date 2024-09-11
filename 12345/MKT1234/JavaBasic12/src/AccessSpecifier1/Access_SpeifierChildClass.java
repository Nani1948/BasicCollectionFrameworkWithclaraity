package AccessSpecifier1;

public class Access_SpeifierChildClass {

	public static void main(String[] args) {
		 
		 Access_Speciifer2 ac1=new  Access_Speciifer2();
		 Access_Speciifer2 ac2=new  Access_Speciifer2(10,20);
         //private access speicifier it will throw an compile error 
		 ac1.multiplication(10,20);// protected.
		 ac1.printTheNumber(2008);//Public.
		
		 
		

	}

}
