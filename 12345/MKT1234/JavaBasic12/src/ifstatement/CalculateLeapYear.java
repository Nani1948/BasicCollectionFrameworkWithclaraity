package ifstatement;

public class CalculateLeapYear {

	public static void main(String[] args) {
		
		int year=2009;
		if(year >= 1 && year <=9999){
	         if(year%4==0){
	           if(year%100==0) {
	              if(year%400==0) {
	                 System.out.println("This is a leap year");
	              }
	              else{
	            	  System.out.println("This is not a leap year");  ;
	              }
	           } 
	           else{
	        	   System.out.println("This is a leap year");;
	           }
	         }
	         else{
	        	 System.out.println("This is not a leap year");;
	         }
	     }
	         else{
	        	 System.out.println("This is not a leap year");
	         }
		
	}

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
