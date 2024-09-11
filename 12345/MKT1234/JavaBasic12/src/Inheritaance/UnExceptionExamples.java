package Inheritaance;

public class UnExceptionExamples {

	public static void main(String[] args) {
		System.out.println(" program is started");
		System.out.println(" program is progress");
		/*int a=100;
		System.out.println(a/0);*/ //throw an Arthematic Expression.
		
		/*String s=null;// throw an nullpointer exeception.
		System.out.println(s.length());*/
		/*String a="123";//convert string into integer 
		int x=Integer.parseInt(a);*/
		/*%String a="abc";
		int x=Integer.parseInt(a);*/// Numberformatexception
		/*int a[]=new int[5];// Array indexout of bound
		a[10]=50;*/
		/*int a=100;//catch block will be executed
		try {
			 System.out.println(a/0);
		 }
		catch(ArithmeticException e) {
			System.out.println("Enter into catch block");
			
		}*/
		
		int a=100;//try block will be executed
		int res=0;
		try {
			 //System.out.println(a/2);
			res=a/0;
		 }
		catch(ArithmeticException e) {
			System.out.println("Enter into catch block");
		}
		System.out.println(res);
		System.out.println(" program is completed");
		System.out.println(" program is excited");
	}

}
