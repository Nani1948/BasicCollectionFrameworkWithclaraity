package Datatypes12;

public class PrintSequenceNumber1 {

	public static void main(String[] args) {
		int a=0,b=1;
	for(int i=0;i<1000;i++) {
	 int c=a+b;
	System.out.println("The sum of a+b is"+ c);
	i--;
	a=b;
	b=c;
	}
	}

}
