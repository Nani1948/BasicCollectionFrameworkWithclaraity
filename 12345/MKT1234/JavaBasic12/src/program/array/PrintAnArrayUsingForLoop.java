package program.array;

public class PrintAnArrayUsingForLoop {

	public static void main(String[] args) {
		// declare an array intilize
				int a[] = {1,2,3,4,5,6,7,8,9,10};
				//display size of array length.
				 //
				System.out.println("The Length of array is :"+a.length);
				System.out.print("Array Element :"); 
				for(int i=0;i<a.length;i++) {
				//	display the array element
					System.out.print(a[i] +"\t");
					 
				}

	}

}
