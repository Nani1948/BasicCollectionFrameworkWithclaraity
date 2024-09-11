package Inheritaance;

public class FinalBlock {

	public static void main(String[] args) {
		System.out.println(" program is started");
		int a=100;
		try {
			System.out.println(a/0);
		}
		catch(NullPointerException e) {
			System.out.println("Enter into the block");
		}
		finally {
			System.out.println("Enter into finally block");
		}
		System.out.println(" program is progress");

	}

}
