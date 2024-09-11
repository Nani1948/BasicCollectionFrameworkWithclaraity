package methodoverloading1;

public class MultipleMethodCanBeOverloading {
	 static void add(int a, int b) 
	    { 
	      System.out.println(a+b);
	    }
	 static void add(float f, double d) 
	    {
	      System.out.println(d+f);
	    }
	 static void add(char c) 
	    {
	      System.out.println(c);
	    }
	 static void add(long s,long l) 
	    {
	      System.out.println(s*l);
	    }
	 static void add(long l, byte b) 
	    {
	      System.out.println(b*l);
	    }
	 
	public static void main(String[] args) {
	    add(12,10);
	    add('C');
	    add(12222334,456789);

	}

}
