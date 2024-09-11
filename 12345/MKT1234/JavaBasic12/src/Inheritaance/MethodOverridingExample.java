package Inheritaance;
class Bank
{	
   double rateOfInterest()
   {
	  return 0;
		
	}
}
class SBI extends Bank
{
	double rateOfInterest()
	   {
		  return 10.05;
			
		}

}
class AXIS extends Bank
{
	double rateOfInterest()
	   {
		  return 9.5;
			
		}

}

public class MethodOverridingExample {

	public static void main(String[] args) {
		  SBI sbiObj= new SBI();
		  System.out.println(sbiObj.rateOfInterest());
           AXIS axisObj=new AXIS();
           System.out.println(axisObj.rateOfInterest());
          
	}

}
