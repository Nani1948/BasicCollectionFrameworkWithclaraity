package Method.StaticAndNonStatic;

public class CreatingAStaticANDNonStaticMethodInPSVM {
// 1.Create a static method
	public static int addition() {
		int a=20;
		int b=20;
		return a+b;
	}
	public void printTheEvenNumber() {
		int num=9;
		if(num%2==0) {
			System.out.println(" The Number Is Even");
		}
			else 
			{
				System.out.println("The Number Is Odd");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // calling a static method
	 	System.out.println( addition());
	// Calling a Non-static method
	 	// 1.Create an object thorough the className
	 	CreatingAStaticANDNonStaticMethodInPSVM  ct=new CreatingAStaticANDNonStaticMethodInPSVM();
	 	ct.printTheEvenNumber();
	 	
	
	}

}
