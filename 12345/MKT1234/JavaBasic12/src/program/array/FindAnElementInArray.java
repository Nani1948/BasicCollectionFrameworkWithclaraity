package program.array;

import java.util.Scanner;

public class FindAnElementInArray {

	public static void main(String[] args) {
		int i,n,search;
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter the number of elemets:");
		 n=scan.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the array elements");
		for( i=0;i<n;i++) {
			a[i]=scan.nextInt();
		
		}
		System.out.println(" Enter the element to be searched");
	 search=scan.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==search) {
				System.out.println("Element is a found: "+a[i]);
				break;
			}
			if(a[i]!=search) {
				System.out.println("Element is not found:");
			}
		}
		
	}

}
