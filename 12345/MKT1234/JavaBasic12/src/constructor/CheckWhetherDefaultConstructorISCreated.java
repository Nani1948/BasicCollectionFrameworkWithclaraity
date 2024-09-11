package constructor;

public class CheckWhetherDefaultConstructorISCreated {
	int id;
	String name;

	void display(){System.out.println(id+" "+name);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckWhetherDefaultConstructorISCreated c1=new CheckWhetherDefaultConstructorISCreated();
		c1.display();
	
		}
	
	}
