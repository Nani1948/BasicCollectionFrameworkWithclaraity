package constructor;

public class ConstructorDemo {
     
	int x;
	int y;
	//Constructor is just used for assign the value but not execute the code
	//Default constructor
	ConstructorDemo(){
		x=10;
		y=20;
		
	}
	//parameter constructor assign the values to x, y)
	ConstructorDemo(int a , int b){
		x=a;
		y=b;
		
	}
	
	void display() {
		System.out.println(x+y);
		
	}
	
	
	public static void main(String[] args) {
		ConstructorDemo c1=new ConstructorDemo();
		c1.display();
		//Invoke default constructor
		ConstructorDemo c2=new ConstructorDemo(100,200);
				c2.display();

	}

}
