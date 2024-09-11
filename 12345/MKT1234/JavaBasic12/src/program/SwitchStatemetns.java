package program;

public class SwitchStatemetns {

 
	public class EqualSumChecker {
	    
	    public boolean hasEqualSum(int year)
	    {
	        
	            //if(year<=1 && year<=9999){
	                if(year%4==0){
	                  if(year%100==0 || year%400==0)
	                     {
	                      
	                        
	                            return true;
	                        
	                    }
	                    
	                } 
	               // }
	               else
	                return false;
					 
	            
	                     
	            
	        
	        
	    }
	}
}