package program;
public class FibnoacciSeries {
	public static void main(String[] args) {		
		int n1=0, n2=1;
		System.out.println("The print number n1 and n2:"+n1 +" "+n2);
		for(int i=0;i<100;i++) {
			int  n3 =n1+n2;
			    
			    System.out.println(""+n3);
			    n1=n2;
			    n2=n3;
		}

	}

}
