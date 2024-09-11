package construcutorOverloading;

public class CreateConstructorOverloading 
{
	CreateConstructorOverloading()
	{
		System.out.println(" I am  a default constructor1");
	
	}
	
	CreateConstructorOverloading(int a , int b)
	{
		System.out.println(" The sum of and b is:"+(a+b));
	
	}
	CreateConstructorOverloading(double d, float f)
	{
	
		System.out.println(" The subtraction of and b is:"+(d-f));
	}
	
	CreateConstructorOverloading( float f,double d)
	{
		
		System.out.println(" The multiplication of a and b is:"+(d*f));
	}
    CreateConstructorOverloading( byte b , short s){
		
		System.out.println(" The multiplication of a and b is:"+(b*s));
	}
    CreateConstructorOverloading(  String s,boolean b){
		
		System.out.println(" I am a string1");
	}
    CreateConstructorOverloading(long l, short s){
		
		System.out.println(" I am a string2");
	}
    CreateConstructorOverloading( String S, int x)
    {
	
  		System.out.println(" I am a string3");
  	}
    CreateConstructorOverloading( int x, boolean b){
		
  		System.out.println(" I am a string4");
  	}
    CreateConstructorOverloading( int x, byte b){
		
  		System.out.println(" I am a string5");
  	}
    CreateConstructorOverloading( int y, char c){
		
  		System.out.println(" I am a string6");
  	}
    CreateConstructorOverloading( boolean b,String s){
		
  		System.out.println(" I am a string7");
  	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CreateConstructorOverloading	nonpara =new CreateConstructorOverloading();
		 CreateConstructorOverloading	para1 =new CreateConstructorOverloading(10,20);
		 CreateConstructorOverloading	para2 =new CreateConstructorOverloading(10.10,20.32f);	
		 CreateConstructorOverloading	para3 =new CreateConstructorOverloading(10.10f,20.32);
		 CreateConstructorOverloading	para4 =new CreateConstructorOverloading(10,-400);
		 CreateConstructorOverloading	para5 =new CreateConstructorOverloading(true,"Welcome");
		 CreateConstructorOverloading	para6=new CreateConstructorOverloading(10,'A');
		 CreateConstructorOverloading	para7=new  CreateConstructorOverloading("Yes",12);
		 CreateConstructorOverloading	para8=new CreateConstructorOverloading(10,false);
		 CreateConstructorOverloading	para9=new CreateConstructorOverloading(10000,-128);
		 CreateConstructorOverloading	para10=new CreateConstructorOverloading(10,'A');
		 CreateConstructorOverloading	para11=new CreateConstructorOverloading(false,"Hello");
	}     
	}


