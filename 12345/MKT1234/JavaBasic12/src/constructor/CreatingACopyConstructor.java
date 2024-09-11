package constructor;

public class CreatingACopyConstructor {
   int id;
   String name;
   //1.Create a constructor
   CreatingACopyConstructor(int i, String n){
	 id=i;
	 name=n;
   }
   //Copying the values of object into another object.
   // create a Constructor to intializes another object
   CreatingACopyConstructor(CreatingACopyConstructor c){
   id=c.id;
   name=c.name;
   //System.out.println(id + " "+ name);
   }
   
   void display() {
	   System.out.println(id + " "+ name);
	   
   }
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   CreatingACopyConstructor s1=new CreatingACopyConstructor(111,"krian");
	   CreatingACopyConstructor s2=new CreatingACopyConstructor(s1);
	   s1.display();
	   s2.display();
   }

}
