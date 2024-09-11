package program;

public class MethodOverloading {
	void add(int a, int b) {
		System.out.println(a+b);
		
	}
	void add(int a, double b) {
		System.out.println(a+b);
		
	}
	void add(double a, double b) {
		System.out.println(a+b);
		
	}
	void add(int a, int b,int c ){
		System.out.println(a+b+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MethodOverloading s2=new MethodOverloading();
        s2.add(10,20,30);
        s2.add(9.000, 6.000);
	}

}
