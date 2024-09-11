package AbstractClassAssignement;
abstract class A{
abstract void man();
abstract void woman();

}

abstract class B extends A{
}
abstract class C extends B{
	void add() {
		System.out.println("I am non-static method");
	}

}





public class CheckWhetherMyOverridenMethodInTheTopMostOfParentClassInMainMethod extends C {

	public static void main(String[] args) {
		CheckWhetherMyOverridenMethodInTheTopMostOfParentClassInMainMethod b=new CheckWhetherMyOverridenMethodInTheTopMostOfParentClassInMainMethod();
         b.man();
         b.woman();
         b.add();
     	}
     	

	@Override
	void man() {
	System.out.println("I am man");
		
	}

	@Override
	void woman() {
		// TODO Auto-generated method stub
		System.out.println("I am woman");	
	}
	
}




	


