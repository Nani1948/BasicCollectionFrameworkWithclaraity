package AbstractClassAndMethod;

import java.util.Scanner;

class T1
{
	static void age()
	{ int age=20;
		if (age>18)
		{
			System.out.println("my age is 20");
		}
		else
		{
			System.out.println("my age is less that 20");
		}
	}
}
class M1 extends T1
{
	void multiplication()
	{
	   Scanner A1=new Scanner(System.in);
	   System.out.println("enter value of a");
	   int a=A1.nextInt();
	   System.out.println("enter value of b");
	   int b=A1.nextInt();
	   int c=a*b;
	   System.out.println("multiplication of two number is "   +c);
	}
}
class O1 extends M1
{
	static void marks()
	{
	 int marks=65;  
    
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>=50 && marks<70){  
        System.out.println("D grade");  
    }  
}
public class S1 extends O1 {
	
	  void negative1()
	{
		  int number=-13;   
		  
		    if(number>0)
		    {  
		    System.out.println("POSITIVE");  
		    }
		    else if(number<0){  
		    System.out.println("NEGATIVE");
		    }
		    else
		    {  
		        System.out.println("ZERO"); 
		    }
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting
			T1 t1=new O1();// implicity 
				t1.age();
				//downcasting
				   S1 o=(S1)t1;
				   o.negative1();
				   o.marks();
				   o.age();
				   o.multiplication();
				    

	}

}
}
