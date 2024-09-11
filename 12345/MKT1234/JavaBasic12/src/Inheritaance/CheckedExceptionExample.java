package Inheritaance;

public class CheckedExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(" program is started");
		System.out.println(" program is progress");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}*/
		
		Thread.sleep(5000);
		System.out.println(" program is completed");
		System.out.println(" program is exited");

	}

}
