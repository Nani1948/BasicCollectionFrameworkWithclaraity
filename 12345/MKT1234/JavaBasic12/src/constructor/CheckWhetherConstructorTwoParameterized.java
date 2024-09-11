package constructor;

public class CheckWhetherConstructorTwoParameterized {
     //1.Create aconstructor
	  String name;
	   int id;
	   public CheckWhetherConstructorTwoParameterized(int i, String n) {
		 id=i;
		 name=n;
	   }
	   void display() {
		   System.out.println(id +" "+ name);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckWhetherConstructorTwoParameterized ct=new CheckWhetherConstructorTwoParameterized(101,"Kiran");
		ct.display();
		CheckWhetherConstructorTwoParameterized c=new CheckWhetherConstructorTwoParameterized(102,"Varshini");
		c.display();
		
	}

}
