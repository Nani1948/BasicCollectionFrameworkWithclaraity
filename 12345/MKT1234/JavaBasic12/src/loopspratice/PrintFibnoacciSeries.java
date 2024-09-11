package loopspratice;

public class PrintFibnoacciSeries {

	public static void main(String[] args) {
		
		int a=0; 
		int b=1;
	int count=10;
		System.out.println("Fibonacci series of" + count +" numbers:");
		
		for(int i=1;i<=count;i++) {
			
			System.out.print( a + " ");
			int c= a+b;
	         a=b;
	         b=c;
		
		}
	
	}

}
