package methodoverloading1;
import java.util.Scanner;
//Write a java program to print area of triangle and circle 
public class Assignment20 {
      void getAreaOfCircle() {
    	  Scanner scan=new Scanner(System.in);
    	  System.out.println("Enter the radius:");
    	  double radius=scan.nextDouble();
    	  double  areaOfCircle= Math.PI*radius*radius;
    	  System.out.println("Area of Circle:"+areaOfCircle);
    	  
      }
      void getAreaOfTraingle() {
    	  Scanner scan=new Scanner(System.in);  
    	  System.out.println("Enter the base:");
    	  double base=scan.nextDouble();
    	  System.out.println("Enter the height:");
    	  double height=scan.nextDouble();
    	  double  areaOfTriangle=0.5*base*height;
    	  System.out.println("Area of Circle:"+areaOfTriangle);
    	  
      }
	public static void main(String[] args) {
		Assignment20 Ass=new Assignment20();
		Ass.getAreaOfCircle();
		Ass.getAreaOfTraingle();

	}

}
