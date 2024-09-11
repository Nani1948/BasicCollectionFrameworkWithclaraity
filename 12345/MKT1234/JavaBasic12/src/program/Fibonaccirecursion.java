package program;

public class Fibonaccirecursion {

	public static int fibnoRecursion(int n){
		if(n==0)
		{ 
			return 0;
		}
		if(n==1) {
			return 1;
		}
         return fibnoRecursion(n-2)+ fibnoRecursion(n-1);	
         
	}
	public static void main(String []args)
	{
		int n=10;
		System.out.println("Fibonacci series of "+ n +" numbers:");
		for(int i=0;i<n;i++) {
			System.out.println(fibnoRecursion(i) + "");
		}
	}
}
