package program.array;
import java.util.Scanner;

public class SumOfAllArray {

	public static void main(String[] args) {
		
		int Size;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter no.of.elements in array");
        Size=scan.nextInt();
		int a[]= new int[Size];
		System.out.print("Enter "+Size+" elements in array");
		
	   int sum=0;
	   for(int i=0; i<Size;i++) {
		   a[i]=scan.nextInt();
	   }
		for(int i=0;i<Size;i++) {
		 sum=sum+a[i];
		 
		}
		System.out.println(" The sum of all element in the array:"+sum);
	}

}
