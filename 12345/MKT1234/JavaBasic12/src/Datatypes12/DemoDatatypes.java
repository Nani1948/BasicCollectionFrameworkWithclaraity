package Datatypes12;

public class DemoDatatypes {
public static void main(String[]args) {
 int a[]= {4,5,6,7,8};	
 int b[]= {4,4,5,5,6,7,8,6,7,8,4,5};

 int i,j=0;

 for(i=0;i<a.length;i++) { 
	 //System.out.println("The element of array" + res);
	 int count=0;
	 for(j=0;j<b.length;j++) {
		 if (a[i]==b[j]) {
			 count++;
		 }	 
		 
	 }
	 System.out.println(a[i] +" "+ "occured"+ "  "+count);
 }
 
 }
}
	