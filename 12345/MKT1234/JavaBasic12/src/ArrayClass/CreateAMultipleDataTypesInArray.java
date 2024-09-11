package ArrayClass;

public class CreateAMultipleDataTypesInArray {
     
	public static void main(String[] args) {
		int a []=new int[4];// declaration & intialziation
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println("The array of a[0]:"+a[0]);
		System.out.println("The array of a[1]:"+a[1]);
		System.out.println("The array of a[2]:"+a[2]);
		System.out.println("The array of a[3]:"+a[3]);
		//Array size is fixed,Here array size is 5, if i try to print the size >5
		
	String str [];
	str=new String[5];
	str[0]="Cat";
	str[1]="Dog";
	str[2]="Donkey";
	str[3]="Goat";
	str[4]="Hen";
	System.out.println("The array of str[0]:"+str[0]);
	System.out.println("The array of str[1]:"+str[1]);
	System.out.println("The array of str[2]:"+str[2]);
	System.out.println("The array of str[3]:"+str[3]);
	System.out.println("The array of str[4]:"+str[4]);
	// Size< 4
	Double d []=new Double[4];
	d[0]=100.12;
	d[1]=100.14;
	d[2]=120.14;
	System.out.println("The array of d[0]:"+d[0]);
	System.out.println("The array of d[1]:"+d[1]);
	System.out.println("The array of d[2]:"+d[2]);
	
// float
	float fl[]=new float[4];
	fl[0]=100.12f;
	fl[1]=100.14f;
	fl[2]=123.12f;
    fl[3]=124.14f;
    System.out.println("The array of fl[0]:"+fl[0]);
	System.out.println("The array of fl[1]:"+fl[1]);
	System.out.println("The array of fl[2]:"+fl[2]);
	
//long
	long l []= {10000,2000000,30000000,40000000};
	System.out.println(l);
//Short
	short s []= {12344,32567,32456};
	System.out.println(s);
	// char
	char c[]= {'A','B','C','D','E'};
	System.out.println(c);
// boolean
   boolean b[]= {true,false};
   System.out.println(b);

	}
}