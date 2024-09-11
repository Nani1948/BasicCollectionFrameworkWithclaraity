package program;

public class IFELSEIFProgram {
	public static void main(String[]args) {
		int a=200;
		int b=400;
		int c=300;
		
		if(a>=b && a>=c) 
		{
			System.out.println(" a is greater than b");
			
		}
		else if( b>=c && b>=a) {
			System.out.println(" b is greater than c ");
		}
		
		else if(c>=b && c>=a) {
			System.out.println(" c is greater than b ");
		}
		else 
		{
			System.out.println(" Number is not greater than c, b,a ");
		}
	}

}
