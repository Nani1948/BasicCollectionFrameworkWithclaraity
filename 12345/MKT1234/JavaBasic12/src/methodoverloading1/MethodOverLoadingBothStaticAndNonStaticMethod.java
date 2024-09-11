package methodoverloading1;

public class MethodOverLoadingBothStaticAndNonStaticMethod {
     static void nandhini() {
    	 System.out.println(" I am nandhini");
     }
     void nandhini(int a, long l) {
    	 System.out.println(l/a);
     }
     void nandhini(int a , char b) {
    	 System.out.println(" I am nandhini");
     }
    	
	public static void main(String[] args) {
		nandhini();
		MethodOverLoadingBothStaticAndNonStaticMethod m1=new MethodOverLoadingBothStaticAndNonStaticMethod();
		m1.nandhini(2,12222222);
	}

}
