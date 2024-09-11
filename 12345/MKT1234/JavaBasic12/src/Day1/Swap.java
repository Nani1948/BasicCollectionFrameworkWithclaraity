package Day1;

public class Swap {
 public static void main(String[] args) {
	 int a=5,b=10,temp;
	 System.out.println("Before Swapping is--");
	 System.out.println("The value of a before swapping is:" +a);
	 System.out.println("The value of b before swapping " +b);
	 
	 temp=a;
	 a=b;
	 b=temp;
	 System.out.println("After Swapping is--");
	 System.out.println("The value of a after swapping is:" +a);
	 System.out.println("The value of b after swapping " +b);	
 }
}
