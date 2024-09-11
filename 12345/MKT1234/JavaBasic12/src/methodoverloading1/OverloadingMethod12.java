package methodoverloading1;

public class OverloadingMethod12 {
	
	void sum(int a) {
		System.out.println(a);
	}
    void sum(int a ,double b) {
    	System.out.println(a+b);
    }
    void sum(double a, double b, int c) {
    	System.out.println(a+b+c);
    }
	public static void main(String[] args) {
		OverloadingMethod12 om=new OverloadingMethod12();
		om.sum(10.15,20.00,5);

	}

}
