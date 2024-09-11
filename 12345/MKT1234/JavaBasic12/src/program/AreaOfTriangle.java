package program;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
      //Area of Traingle:width*height/2
		Scanner scan=new Scanner(System.in);
		System.out.println("Area of Triangle:");
		 double width=scan.nextDouble();
		 double height=scan.nextDouble();
		double areaOfTraingle=(width*height)/2;
		System.out.println("The Area of trianle is:"+ areaOfTraingle);
		
	}

}
