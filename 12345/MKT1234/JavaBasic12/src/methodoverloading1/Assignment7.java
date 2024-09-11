package methodoverloading1;
import java.util.Scanner;

public class Assignment7 {
     static int getSum(int num) {
    	 int sum=0;
    	 while(num!=0) {
    		 sum=sum+num%10;
    		 num=num/10;
    	 }
    	 return sum;
     }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Input Number :");
	   int  num=scan.nextInt();
	  System.out.println("  sum of the digits of an integer:"+getSum(num));

	}

}
