package ifstatement;

public class MultipleIfCondition {

	public static void main(String[] args) {
      int salary=1000000;
       if(salary>10000) {
    	   System.out.println("There is no hike1");
       }
       
       if(salary>10000 && salary<20000) {
    	   System.out.println("There is no hike2"); 
       }
       
       if(salary!=20000 && salary<=30000) {
    	   System.out.println("There is no hike3"); 
       }
       if(salary>=30000 && salary<=50000) {
    	   System.out.println("There is a  hike1"); 
       }
       
       if(salary>=60000 || salary<=100000) {
    	   System.out.println("There is a  hike2"); 
       } 
	}

}
