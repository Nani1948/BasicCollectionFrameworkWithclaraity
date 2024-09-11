package Datatypes12;

import java.io.File;
import java.util.Scanner;

public class FileInputStream {

	public static void main(String[] args) {
	  try {
		  File fin=new File("Datatypes.txt");
		  Scanner scan=new Scanner(fin);
		  int count=0;
		  if(fin.canRead()) {
		     count++;
			  System.out.println(count);			  
		  }
		  scan.close();
	    } 
	  catch (Exception e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
		  
		  
	  }

	}

}