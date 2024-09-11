package inheritance12;

public class CreatingInheritanceWithOutExtendsKeyword {
//1.Create a static method
	static void addition()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
}

	public class ChildClass() {
		static void subtraction(){
		
			int a=10;
			int b=20;
			System.out.println(a-b);
		}	
	
	public static void main(String[] args) {
		addition();
		subtraction();

	}

}
}