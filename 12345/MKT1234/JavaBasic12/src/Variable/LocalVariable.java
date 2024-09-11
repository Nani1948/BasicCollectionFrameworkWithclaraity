package Variable;

public class LocalVariable {
    //global variable 
		int a =20;
       static  int b=30;
	void printTheNumber() {
		// local variable
		final int a =10;
		// final variable
		if(a>b) {
			System.out.println("A is greater than B");
		}
		else {
			System.out.println("A is not greater than B");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //local variable
		int a =10;
		 int b=20;
	
         System.out.println(a+b);
         LocalVariable lo=new LocalVariable();
         lo.printTheNumber();
	}

}
