package program;

import java.util.Scanner;

public class DistanceBetweenTwoPoint {
public  static void main(String[] args) {
		 try (Scanner scan = new Scanner(System.in)) {
			// declare variables
		    int x1, x2, y1, y2, x, y;
		    double distance;

		    // read points coordinates
		    System.out.print("Enter first point coordinates: ");
		    x1 = scan.nextInt();
		    y1 = scan.nextInt();
		    System.out.print("Enter second point coordinates: ");
		    x2 = scan.nextInt();
		    y2 = scan.nextInt();

		    // calculate the distance between them
		    x = x2-x1;
		    y = y2-y1;
		    distance = Math.sqrt(x*x + y*y);

		    // display result
		    System.out.println("Distance between them = " + distance);
		}
	}

}
