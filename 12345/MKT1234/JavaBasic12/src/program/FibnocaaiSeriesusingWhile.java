package program;

public class FibnocaaiSeriesusingWhile 
{
	 public static void main(String[] args) 
	 {
		 int x=0;
		 int y=1;
		 int n=10;
		 System.out.println("Fibonacci series till" + n + " terms:");
		 int i=1;
        while(i<= n)
        {
		  
		   System.out.println(x + ",");
		   int z=x+y;
		   x=y;
		   y=z;
		   z++;
        }
	 }

}
