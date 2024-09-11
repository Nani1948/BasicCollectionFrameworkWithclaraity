package Collections;
import java.util.Collections;
import java.util.Vector;
public class VectorListAssignment {

	public static void main(String[] args) {
	  Vector vectRef1=new Vector();
	  //add(obj):Add the new object or element at the end of the vector list.  
		// Adding all the element in the collections
	       // It is a following the indexing because the random access is possible.
	        //It is a following the order of insertion
	        vectRef1.add("Ravi");//0 1
	        vectRef1.add(100);//1 2   
	        vectRef1.add("Ravi");//23
	        vectRef1.add(100.24);//3
	        vectRef1.add("Manish");//4
	        vectRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        vectRef1.add(10000000);//6
	        vectRef1.add(32567);//7
	        vectRef1.add('A');//8
	        
	        // Dynamic size
	        vectRef1.add("Ravi");//0 1
	        vectRef1.add(100);//1 2   
	        vectRef1.add("Ravi");//23
	        vectRef1.add(100.24);//3
	        vectRef1.add("Manish");//4
	        vectRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        vectRef1.add(10000000);//6
	        vectRef1.add(32567);//7
	        vectRef1.add('A');//8
	        vectRef1.add("Ravi");//0 1
	        vectRef1.add(100);//1 2   
	        vectRef1.add("Ravi");//23
	        vectRef1.add(100.24);//3
	        vectRef1.add("Manish");//4
	        vectRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        vectRef1.add(10000000);//6
	        vectRef1.add(32567);//7
	        vectRef1.add('A');//8
	        vectRef1.add("Ravi");//0 1
	        vectRef1.add(100);//1 2   
	        vectRef1.add("Ravi");//23
	        vectRef1.add(100.24);//3
	        vectRef1.add("Manish");//4
	        vectRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        vectRef1.add(10000000);//6
	        vectRef1.add(32567);//7
	        vectRef1.add('A');//8
	        vectRef1.add("Ravi");//0 1
	        vectRef1.add(100);//1 2   
	        vectRef1.add("Ravi");//23
	        vectRef1.add(100.24);//3
	        vectRef1.add("Manish");//4
	        vectRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        vectRef1.add(10000000);//6
	        vectRef1.add(32567);//7
	        vectRef1.add('A');//8
	        vectRef1.add("Ravi");//0 1
	        vectRef1.add(100);//1 2   
	        vectRef1.add("Ravi");//23
	        vectRef1.add(100.24);//3
	        vectRef1.add("Manish");//4
	        vectRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        vectRef1.add(10000000);//6
	        vectRef1.add(32567);//7
	        vectRef1.add('A');//8
	        System.out.println(vectRef1);
	        //add(index,Obj):Add the new object or insert the middle of the Vector through the index.
	        //
	       // in the middle
	        vectRef1.add(4,"123");
	        // in the begining
		
	        vectRef1.add(0,1234444);
	        //at the end
	        
	        vectRef1.add(9,"Priya");
	        System.out.println(vectRef1);
	        // vector accepting the null values.
	        vectRef1.add(10,null);
	        //size:Find the no.of.elemets or object in the Vector.
	        System.out.println(vectRef1.size());
	        // clear : it will clear all the elements present in the Vector.
	        //vectRef1.clear();
	        // Cloning:Meaning :copy
	        //if  i clone this using sop, then you need to get another vector object for cloning
	       // System.out.println(vectRef1.clone());// cloning values
	       // System.out.println(vectRef1);//just print it.
	        //what if you want to cloning values store in the another vector list.
	       Vector v2=new Vector();
	       v2=(Vector)vectRef1.clone();
	       System.out.println(v2);
	       System.out.println(vectRef1);
	       //contains: check whether the elements or object are present in the vector list.
	       
	       System.out.println(vectRef1.contains("Ravi"));// we can't pass the message 
	       //get(index):Retrive an object or element through index from the vector list
	       System.out.println(vectRef1.get(5));
	       //set(index,obj):Replace existing object or element with new elements (or)object htrough the index isndie the vector list.
	       System.out.println(vectRef1.set(11,"Dog"));
	       System.out.println(vectRef1);
	       // indexOf(Obj o):You will get the index of the elements or object from the vector list.
	       System.out.println(vectRef1.indexOf("Priya"));
	       
	       // lastIndexOf:You will get last Index of the element in the vector list
	       System.out.println(vectRef1.lastIndexOf('A'));
	       //vectRef1.clear();
	        
	   
	   //Collection.sort(vectRef2);
	      // Order of insertion:
	   Vector vectRef2=new Vector();
	   vectRef2.add("200");
	   vectRef2.add("100");
	   vectRef2.add("300");
	   Collections.sort(vectRef2);
	   System.out.println(vectRef2); 		
	   
	}

}
