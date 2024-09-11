package program;
import java.util.Scanner;

public class NumberSeriesPattern1 {
	
		static void getTheFollowingPattern() {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the number :");
		   int  num=scan.nextInt();
		   int i=2;
		  while(i<=num) {
			  System.out.println(i);	
		i=i+2;
		
		   }
		}
		
		public static void main(String []args) {
			getTheFollowingPattern();
		}

	}




