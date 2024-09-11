package program;
import java.util.Scanner;

public class FindEvenNumberUsingArray {

	public static void main(String[] args) {
		
		int Size;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter no.of.elements in array");
        Size=scan.nextInt();
		int a[]= new int[Size];
		System.out.print("Enter "+Size+" elements in array");
		
	  
	   for(int i=0; i<Size;i++) {
		   a[i]=scan.nextInt();
	   }
	   
	   System.out.print(" Number is even:");
		for(int i=0;i<Size;i++) {
		 if(a[i]%2==0) {
		 System.out.print(" "+a[i]);
		}
			
	}
	
}
}