package class12;

public class MyFirstJavaProgram {
    void myAddition() 
    {
    	int x=20;
		int y=40;
		// TODO Auto-generated method stub
		System.out.println("Sum of x and y is:" +(x+y));
		
    }
    void mySubtraction() {
    int x=20;
	int y=40;
    System.out.println("Diff of x and y is:"+(y-x));
    }
	public static void main(String[] args) {
		MyFirstJavaProgram sc=new MyFirstJavaProgram();
		          sc.myAddition();
		MyFirstJavaProgram s=new MyFirstJavaProgram();
		          s.mySubtraction();
	

	}

}
