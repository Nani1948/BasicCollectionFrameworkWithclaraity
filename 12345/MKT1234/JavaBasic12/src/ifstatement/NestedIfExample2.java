package ifstatement;

public class NestedIfExample2 {

	public static void main(String[] args) {
	     int age=90;
	     if(age >=25) {
	    	 System.out.println(" My age is greater than 25 ");
	    	 if(age >25 && age<=50) {
	    		// System.out.println("My age is b/w 25 and 50");
	    		 if(age > 50  && age <=90) {
	    			 System.out.print("My age is b/w 50 and 90");
	    		 }
	    		 else {
	    			 System.out.println("My age is not b/w 50 and 90");
	    		 }
	    		 
	    		 
	    		 
	    	 }
	    	 else {
	    		 System.out.println("My age is not b/w 25 and 50");
 
	    	 }
	    	 
	     }
	     else {
	    	 System.out.println("My age is less than 25");
	     }

	}

}
