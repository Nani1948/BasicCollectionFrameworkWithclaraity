package Method.StaticAndNonStatic;
public class CallingAMultipleStaticMethodAndNonStatic {
    static void add() {
    	int a=10, b=20;
    	System.out.println("The sum of a and b is:" +(a+b));
    }
    static void sub() {
    	int a=10, b=20;
    	System.out.println("The sub of a and b is:" +(a-b));
    }
    static void mul() {
    	int a=10, b=20;
    	System.out.println("The mul of a and b is:" +(a*b));
    }
    static void divi() {
    	int a=10, b=20;
    	System.out.println("The sum of a and b is:" +(a+b));
    }
    void printTheNumber() {
         int n=10;
         if(n>5) {
    	 System.out.println("The number is greater than 5");
    	 }
         else {
         System.out.println("The number is less than 5");
         }
    }
    void  printTheNumberisEvenOrOdd(){
    	 int n=10;
         if(n%2==0) {
         System.out.println("I am a even number ");
         }
         else {
         System.out.println("I am an odd number");
         }
    	
    }
    
	public static void main(String[] args) {
		 add();
		 sub();
		 mul();
		 divi();
		 CallingAMultipleStaticMethodAndNonStatic n1=new CallingAMultipleStaticMethodAndNonStatic();
		 n1.printTheNumber();
		 n1.printTheNumberisEvenOrOdd();
		

	}

}
