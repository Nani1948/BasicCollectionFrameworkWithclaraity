package InterfaceBasicCOncept2;
interface demo3{
	// abstract method
		void add();
		void sub(); // or abstract void sub();	
}
interface demo2{
	void add1();
	void sub2(); // or abstract void sub();
}
public class CreateMultipleInterface implements demo2,demo3 
{

	public static void main(String[] args) {
		//CreateMultipleInterface c=new CreateMultipleInterface();
		//add();
		//add1();
		//sub();
		//sub2();
	}
	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("I am additon");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("I am subtraction");
	}

	@Override
	public void add1() {
		// TODO Auto-generated method stub
		System.out.println("I am additon1");
	}

	@Override
	public void sub2() {
		// TODO Auto-generated method stub
		System.out.println("I am subtraction2");
	}
	}

