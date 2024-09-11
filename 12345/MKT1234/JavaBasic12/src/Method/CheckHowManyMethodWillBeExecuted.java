package Method;

public class CheckHowManyMethodWillBeExecuted {
	//1.Create a static method  
	static void addition() {
		int a=10;
		   int b=20;
	   System.out.println(a+b);
   }
   //2.Create non-static method
   void multiplication() {
	   int a=10;
	   int b=20;
	   System.out.println(a*b);
   }
   //3.Create a constructor
   CheckHowManyMethodWillBeExecuted(){
	  System.out.println("I am a constructor");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoked a constructor
		CheckHowManyMethodWillBeExecuted cH1= new CheckHowManyMethodWillBeExecuted();
		//invoked a non-static method
		CheckHowManyMethodWillBeExecuted cH2=new CheckHowManyMethodWillBeExecuted();
		cH2.multiplication();
	   // Calling a method
		addition();
	}

}
