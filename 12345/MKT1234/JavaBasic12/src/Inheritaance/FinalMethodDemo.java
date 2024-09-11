package Inheritaance;

class Bike
{
	final void run() //Final method, we can't override this method in child class.
	{
		System.out.println("Running............");
	}
}
class Honda extends Bike
{
	void run() //compile time 
	{
		System.out.println("Started............");	
	}
}
public class FinalMethodDemo {

}
