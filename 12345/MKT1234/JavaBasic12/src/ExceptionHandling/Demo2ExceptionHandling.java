package ExceptionHandling;

public class Demo2ExceptionHandling {

	public static void main(String[] args) {
		int marks[];
	    marks=new int[5];
	    marks[0]=11;
	    marks[1]=13;
	    marks[2]=22;
	    marks[3]=55;
	    marks[4]=55;
	    try {
	    marks[5]=55;
	    }
	    catch(ArrayIndexOutOfBoundsException a){
	    	System.out.println("Exception is handled which was coming from pavithra method.");
	    }
	    catch(NullPointerException b){
	    	System.out.println("Exception is handled which was coming from pavithra method.");
	    }

	}

}
