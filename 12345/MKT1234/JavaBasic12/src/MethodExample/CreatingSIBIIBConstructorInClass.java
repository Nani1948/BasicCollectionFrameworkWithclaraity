package MethodExample;

public class CreatingSIBIIBConstructorInClass {
//.Create SIB
	static {
		System.out.println("I am static intiliazation block");
	}
//2.Create a construtor
		CreatingSIBIIBConstructorInClass(){
			int a =10;
			int b=20;
			System.out.println(a+b);
		}
//3.Create IIB
	{
		System.out.println("I am Instance Intialization Block");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingSIBIIBConstructorInClass cr=new CreatingSIBIIBConstructorInClass();
	}

}
