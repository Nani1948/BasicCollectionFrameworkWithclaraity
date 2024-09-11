
interface A
{
	int a=20;
	// by default variables i interface are static and final then assign value
     void m1();// abstract method,by default public    	      
}
public class TestDemo implements A 
{
    public void m1() {
    	System.out.println(a);
    }
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*TestDemo td = new TestDemo();
       td.m1();*/
		A a =new TestDemo();// A interface name , TestDemo class name.
	    a.m1();
	}

}
