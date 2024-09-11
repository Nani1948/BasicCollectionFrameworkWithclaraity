package methodoverloading1;
import java.util.Scanner;

public class FunctionOverloading {
  static void findMaxTwoNumber() {
	   Scanner scan=new Scanner(System.in);
	   System.out.print(" Enter two number");
	   int  a=scan.nextInt();
	   int b=scan.nextInt();
	    
	    if(a > b) {
	    	System.out.println(" a is greater than b");
	    }
	    else {
	    	System.out.println(" b is greater than a");
	    }
   }
  static void findMaxThreeNumber(int x, int y, int z) {
	  if(x>y & x >z) {
		  System.out.println(" x is greater than y,z");
	  }
	  else if(y > x && y>z) {
		  System.out.println(" y is greater than x,z");  
	  }
	  else {
		  System.out.println(" z is greater than x, y");
	  }
		  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading fo=new FunctionOverloading();
		fo.findMaxTwoNumber();
		fo.findMaxThreeNumber(10,30,20);
	}

}
