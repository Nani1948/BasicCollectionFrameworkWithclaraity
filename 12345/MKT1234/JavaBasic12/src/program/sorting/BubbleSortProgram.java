package program.sorting;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortProgram {

	   void getTheOrderOfBubbleSort() {
			 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element before sorting: ");
		int size= sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Array before sorting:"+Arrays.toString(a));
		
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;				}
			}
		}
	
	  }

	public static void main(String [] args) {
		BubbleSortProgram sort=new BubbleSortProgram();
		
		sort.getTheOrderOfBubbleSort();
}
}