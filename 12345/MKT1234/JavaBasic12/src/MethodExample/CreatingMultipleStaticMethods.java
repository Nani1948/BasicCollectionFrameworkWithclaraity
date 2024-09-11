package MethodExample;

public class CreatingMultipleStaticMethods {

	static void nandhini(){

		System.out.println("I am a tester");
		}
		static void printTheCompanyName(){
		System.out.println("XXXXXXXX");
		}
		static void printThePhoneNumber(){
			System.out.println("+133344444");
			}
		static boolean printTheBooleanValue(){
			System.out.println(false);
			return false;
			}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling a static method through static method name
		nandhini();
		printTheCompanyName();
		printThePhoneNumber();
		printTheBooleanValue();

	}

}
