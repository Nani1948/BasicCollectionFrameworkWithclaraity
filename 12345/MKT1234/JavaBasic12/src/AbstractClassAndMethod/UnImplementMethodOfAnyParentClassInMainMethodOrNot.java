package AbstractClassAndMethod;
abstract class M6{
abstract void man();
abstract void woman();
}

abstract class M5 extends M6{
	
	
}

abstract class M4 extends M5{
  void add() {
	  System.out.println("I am addition method");
  }
}

public  class UnImplementMethodOfAnyParentClassInMainMethodOrNot  extends M4
{

	public static void main(String[]args) 
	{
		UnImplementMethodOfAnyParentClassInMainMethodOrNot mo=new UnImplementMethodOfAnyParentClassInMainMethodOrNot();
		mo.man();
		mo.woman();
	}
		@Override
		void man() {
			// TODO Auto-generated method stub
			System.out.println(" Iam overriden 1");
		}

		@Override
		void woman() {
			// TODO Auto-generated method stub
			System.out.println(" Iam overriden 1");	
	
	
		}
		
	}


