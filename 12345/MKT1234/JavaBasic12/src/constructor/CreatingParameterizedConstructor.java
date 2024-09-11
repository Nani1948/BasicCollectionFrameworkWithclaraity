package constructor;

public class CreatingParameterizedConstructor {
//.Creating parameterized Constructor
	CreatingParameterizedConstructor(int a, int b){
	System.out.println(a+b);		
	}
	
	//2.Non-Parameterized constructor
	CreatingParameterizedConstructor(){
		System.out.println(" I am a constructor");
	}
	
	public static void main(String[] args) {
		// Constructor will invoked at that time of the object creation by passing the parameter.
		CreatingParameterizedConstructor parameter=new CreatingParameterizedConstructor(2,4);
		//Constructor will invoked at that time of the object creation by not passing the parameter.

		CreatingParameterizedConstructor nonParameterized=new CreatingParameterizedConstructor();

		
	}

}
