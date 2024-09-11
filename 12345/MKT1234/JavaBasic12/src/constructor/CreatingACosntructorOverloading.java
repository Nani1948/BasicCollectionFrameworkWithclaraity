package constructor;

public class CreatingACosntructorOverloading {
	 int id;  
	    String name;  
	    int age;  
	CreatingACosntructorOverloading(int i, String s){
		id=i;
		name=s;
		System.out.println(id+" "+name); 
	
	}
	CreatingACosntructorOverloading(int i, String s){
		
	id=i;
	name=s;
	age=a;
	System.out.println(id+" "+name); 
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingACosntructorOverloading ct =new CreatingACosntructorOverloading(101,"Krian");
		CreatingACosntructorOverloading c =new CreatingACosntructorOverloading(101,"Reddy");
	}

}
