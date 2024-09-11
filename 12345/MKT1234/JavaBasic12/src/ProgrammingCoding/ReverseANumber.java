package ProgrammingCoding;
import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a  number:");
    int num=scan.nextInt();
    
   /* // Algorithm-Logic-1
    int rev=0;
     while(num!=0) {
    	 rev=rev*10+num%10;
    	 num=num/10;
     }
    //Logic -2 StringBuffer class
    //Convert num to string using (String.valueOf(num))
    StringBuffer sb=new StringBuffer(String.valueOf(num));
    StringBuffer rev=sb.reverse();*/
    
    
    //Logic3:StringBuilder class
    StringBuilder sb1=new StringBuilder();
    sb1.append(num);
    StringBuilder rev=sb1.reverse();
    	
    System.out.println("Reverse a number :"+rev);
	}

}
