package program.array;

public class Lesson2 {
public static void main(String []args) {
 int a[]={10,20,30,40,50};
 int sum=0;
 int avg=0;
 for(int i=0;i<a.length;i++) 
 {
	sum=sum+a[i];
	avg=sum/a.length;
	// using sop inside the for loop, you can print the sum of array for each increment.
  //System.out.println("The sum of array is:"+ sum);
 }
 //using outside the forloop, you can just print the sum of array at a once.
 //System.out.println("The sum of array is:"+ sum);
 //.System.out.println("The avg of array is:"+ avg);
}
}
