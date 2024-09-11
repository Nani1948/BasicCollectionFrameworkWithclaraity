package JavaIO;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	/*
	 * File Handling-1:
	 * Copy a file (pdf) and create a different file in the same location.
	 * @param
	 *Create a file object
	 *Create fileinput stream object.
	 *Create fileoutput stream object.
	 */
public static void main(String[]args) {
	File fil=new File("/Users\\knand\\Downloads\\Receipt-SDT4837OA.pdf");
	File opFil=new File("/Users\\knand\\Downloads\\Receipt-SDT4837OA-Copy.pdf");
   
   FileInputStream fileInputStream=null;
   FileOutputStream fileOutputStream=null;
   try {
   fileInputStream =new FileInputStream(fil);
   fileOutputStream =new FileOutputStream(opFil);
   }
   catch(FileNotFoundException e) {
	   e.printStackTrace();
   }
   try {
   System.out.println(fileInputStream.available());
   }
   catch(IOException e) 
   {
   e.printStackTrace();
}
   int i=0;
   try {
   while(i=fileInputStream.read()!=-1) {
	   fileOutputStream.write(i);
   }
   }catch(IOException e) {
	   e.printStackTrace();
   }
   
   finally {
	   if(fileInputStream!=null) {
		   try {
			   fileOutputStream.close();
		   }
		   catch(IOException e) {
			   e.printStackTrace();
		   }
		   
	   }
	   
	   if(fileInputStream!=null) {
		   try {
			   fileOutputStream.close();
		   }
		   catch(IOException e) {
			   e.printStackTrace();
		   }
		   
	   }
	   if(fileOutputStream!=null) {
		   try {
			   fileOutputStream.close();
		   }
		   catch(IOException e) {
			   e.printStackTrace();
		   }
		   
	   }
	   }
   }
}


