package program;
import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=scan.nextInt();
		
		/*int fact=1,i;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);*/
		
//or
		int fact=1,i;
		
		for(i=num;i>=1;i--) {
			fact=fact*i;
		}
		
		System.out.println(fact);
		//Using recurision
		
	}

}
