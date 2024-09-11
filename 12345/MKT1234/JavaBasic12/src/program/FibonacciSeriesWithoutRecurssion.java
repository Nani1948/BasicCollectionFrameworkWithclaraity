package program;

public class FibonacciSeriesWithoutRecurssion {

	public static void main(String[] args) {
	int n1=0; int n2=1;
	System.out.print("Print n1 and n2:"+n1 +" "+ n2);
	int count =20;
	for(int i=0;i<=count;i++) {
	 int n3=n1+n2;
	 System.out.print(" " +n3);
	 n1=n2;
	 n2=n3;
	 
	}
	}

}
