package loopspratice;

public class PrintTheNumber {
	void addition(int a, int b) {
   	 System.out.println(a+b);
    }

	public static void main(String[] args) {
	// Creating a object for the class
PrintTheNumber ct=new PrintTheNumber();
		
		
		for(int i=0;i<10;i++) {
		// calling a non-static method inside for loop .To print the addition for 10 times.
		
			ct.addition(10,20);
	
		}
	}
	


	}


