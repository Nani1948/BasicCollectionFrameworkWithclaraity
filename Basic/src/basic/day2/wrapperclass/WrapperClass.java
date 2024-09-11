package basic.day2.wrapperclass;

public class WrapperClass {
	//In java ,Every entity is treated as object and primitive data type.
	//That it is not 100% pure object 
	//Primitive data type:boolean,char,double,float,short,int,long,byte
	//Wrapper Class: we can wrap the primitive data types into  object of that class.
	//They are divide into Eight class:Integer,Byte,Boolean,Long,Float,Double,Short,Character
	//How do you convert integer to double?
//A) doubleValue,intValue,FloatValue and return type is primitive Ex intvalue():int-Integer
	//How do you convert int to Integer?
	//A)boxing parseInt()-How do you convert String to Integer
	//In a collection framework,
	public static void main(String []args) {
		
		String s="123";
		int c=Integer.parseInt(s);
		System.out.println(c);
		int a=10;
		Integer b=new Integer(a);//Converting Primitive Data into Object of that class.
		System.out.println(b);// boxing 
	   
		Integer val=34;
	    
		
	}

}
