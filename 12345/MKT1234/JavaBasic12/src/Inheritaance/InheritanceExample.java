package Inheritaance;

//
 class A
 {
  int a;
 void display(){
	 System.out.println(a);
 }
 }
 class B extends A //
 {
 int b;
 void print(){
 System.out.println(b);
 }
 }
 class C extends B
 {
	 int c;
	 void show() {
		 System.out.println(c);
	 }
	 
 }
public class InheritanceExample {

	public static void main(String[] args) {
		A aobj=new A();
		aobj.a=100;
		aobj.display();
		
		B bobj= new B();
		bobj.a=400;
		bobj.b=200;
        bobj.print();
        bobj.display();
        
        C cobj=new C();
        cobj.a=1000;
        cobj.b=200;
        cobj.c=400;
        cobj.show();
        cobj.print();
        cobj.display();
        
	}

}
