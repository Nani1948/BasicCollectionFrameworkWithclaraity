package ProgrammingCoding;

public class SwapingNumber {
	
	
	public static void main(String[] args) {
		/*int a =10; 
		int b=20;
		int c=30;
		System.out.println("BeforeSwaping of a:"+a  +b +c);
		
		
		a=b;
		b=c;
		int temp=c;;
		
		System.out.println("AfterSwaping a, b,c:" +a  +b  +temp);
		
		
		// Two numbers
		int a=10, b=20;
		System.out.println("Before Swaping values are :"+a+" "+b);
		
		// Logic -1 with third variable
		//int t=a;
		a=b;
		b=t;
		System.out.println("After Swaping values are.."+a+" "+b);*/
		
		int a=10;
		int b=20;
		System.out.println("BeforeSwaping of a:"+a+"  "+b );
		//Logic-2  + and - without using third variables
		//a=a+b;
		//b=a-b;
		//a=a-b;
		//Logic 3 * and/  without using third variables
		a=a*b;
		b=a/b;
		a=a/b;
		// Logic 4 bitwise xOR(^)
		a=a^b;
		b=a^b;
		a=a^b;
	//Logic 5 in asingle statement
		b=a+b-(a=b);
		
		
		
		System.out.println("After Swaping values are.."+a+" "+b);
		
		
		
		
		
		
	}

}
