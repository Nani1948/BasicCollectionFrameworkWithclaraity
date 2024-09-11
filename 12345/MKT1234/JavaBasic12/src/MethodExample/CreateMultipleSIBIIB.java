package MethodExample;
public class CreateMultipleSIBIIB {
	static {
	System.out.println("I am a static intialization 1");
}

{
	System.out.println("I am a Instance intialization 1");
	
}

{
	System.out.println("I am a Instance intialization 2");
	
}

static {
	System.out.println("I am a static intialization 2");
}

{
	System.out.println("I am a Instance intialization 3");
	
}
static {
	System.out.println("I am a static intialization 3");
}
static {
	System.out.println("I am a static intialization 4");
}
CreateMultipleSIBIIB(){
	System.out.println("I am constructor");
}
	public static void main(String[] args) {
		CreateMultipleSIBIIB  cr=new CreateMultipleSIBIIB();
	}

}
