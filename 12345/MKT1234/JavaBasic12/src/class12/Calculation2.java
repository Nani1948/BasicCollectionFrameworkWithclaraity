package class12;

public class Calculation2 {
     int x=10;
     int y=20;
     
    //Case-1Parameter-may not taking parameter and return value-also not returned any value
    /* void sum() {
    	 System.out.println(x+y);
    			
     }*/
     
     //case2:Parameter-may not  taking parameter and return value- returned any value
    /* int sum() 
     {
      return(x+y);
    			
     }*/
     //Case-3:Parameter-may  taking parameter and return value- not returned any value
     /*void sum(int a , int b) {
    	 System.out.println(a+b);
     }*/
     
     //case:4:Parameter-may  taking parameter and return value-  returned any value
     int sum(int a , int b) {
    	 return(a+b);
     }
     
     public static void main(String[] args) {
		//Calling a method(invoked a method at the time of object creation
	     Calculation2 cal=new Calculation2();
	     /*cal.sum();*/ //Case-1
	     //this method return some value.
	     /*int res=cal.sum();//case 2
	     System.out.println(res);*/ // or 
	     
	     //System.out.println(cal.sum());
	     //Method istaking parameter but return some value.
	     /*cal.sum(10,20);*///Case-3
	     
	    System.out.println(cal.sum(100, 10));//case-4
	}

}
