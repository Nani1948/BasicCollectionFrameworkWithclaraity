package staticKeyword;

public class StaticExample {
	static int a=10;//static variables
	int b=20;//non-statci variable
	
	static void m1()//Static method
	{ 
		//Static method can access the non static method by creating an object.
		
		StaticExample se=new StaticExample();
		System.out.println(se.b);		
		System.out.println("this is m1 :static method");
	}
	
    void m2() //non-static method
    {
    	System.out.println("this is m2:Non-static method");
    }
    void m3() {
    	System.out.println("This is non-static method");
    	System.out.println(a);
    	System.out.println(b);
    	m1();
    	m2();
    }
	public static void main(String[] args) {
		//static methods can access only static stuff
		System.out.println(StaticExample.a);
		StaticExample.m1();
		//System.out.println(b);incorrect,bcoz b is non-static variable
		//m2(); incorrect,bcoz m2() is non-static method
		
		//static methods can also access non-static stuff but through object.
		StaticExample se=new StaticExample();
		System.out.println(se.b);//non static variable through object.
		se.m2();//non static method through object.
		se.m3();
	}

	
	}


