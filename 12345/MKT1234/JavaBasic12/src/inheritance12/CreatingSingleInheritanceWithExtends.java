package inheritance12;

public class CreatingSingleInheritanceWithExtends {
	//1.Create a static method
	static void addition()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
}
	public class ChildClassWithExtends extends CreatingSingleInheritanceWithExtends {
		static void subtraction(){
			
			int a=10;
			int b=20;
			System.out.println(a-b);
		}	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			addition();
			subtraction();
	}

}
