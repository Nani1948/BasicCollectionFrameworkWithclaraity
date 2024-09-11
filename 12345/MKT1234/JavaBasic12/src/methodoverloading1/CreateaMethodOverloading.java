package methodoverloading1;

public class CreateaMethodOverloading {
    static void add(int a, int b) {
    	System.out.println(a+b);
    }
    static void add(double b,double d) 
    {
    	System.out.println(b+d);
    }
	void sub(float f, float l) {
		System.out.println(f+l);
	}
	void mul(long l, short s) {
		System.out.println(s*l);
	}
	public static void main(String[] args) {
		add(10,20);
		add(20.12,40.1234567);
		CreateaMethodOverloading c1=new CreateaMethodOverloading ();	
		c1.sub(20.12567f,20.56899f);
		c1.sub(122222222,1222222);
		

	}

}
