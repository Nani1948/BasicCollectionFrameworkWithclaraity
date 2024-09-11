package CollectionsDemo;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListCollections {
	public static void main(String[] args) {
		LinkedList linkRef1=new LinkedList(); 
	      //add(obj):Add the new object or element at the end of the vector list.  
		// Adding all the element in the collections
	       // It is a following the indexing because the random access is possible.
	        //It is a following the order of insertion
		linkRef1.add("Ravi");//0 1
		linkRef1.add(100);//1 2   
		linkRef1.add("Ravi");//23
		linkRef1.add(100.24);//3
		linkRef1.add("Manish");//4
		linkRef1.add("Can");//5
	        //linkRef1.add(true);--boolean 
		linkRef1.add(10000000);//6
		linkRef1.add(32567);//7
		linkRef1.add('A');//8
	        
	        // Dynamic size
		linkRef1.add("Ravi");//0 1
	        linkRef1.add(100);//1 2   
	        linkRef1.add("Ravi");//23
	        linkRef1.add(100.24);//3
	        linkRef1.add("Manish");//4
	        linkRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        linkRef1.add(10000000);//6
	        linkRef1.add(32567);//7
	        linkRef1.add('A');//8
	        linkRef1.add("Ravi");//0 1
	        linkRef1.add(100);//1 2   
	        linkRef1.add("Ravi");//23
	        linkRef1.add(100.24);//3
	        linkRef1.add("Manish");//4
	        linkRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        linkRef1.add(10000000);//6
	        linkRef1.add(32567);//7
	        linkRef1.add('A');//8
	        linkRef1.add("Ravi");//0 1
	        linkRef1.add(100);//1 2   
	        linkRef1.add("Ravi");//23
	        linkRef1.add(100.24);//3
	        linkRef1.add("Manish");//4
	        linkRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        linkRef1.add(10000000);//6
	        linkRef1.add(32567);//7
	        linkRef1.add('A');//8
	        linkRef1.add("Ravi");//0 1
	        linkRef1.add(100);//1 2   
	        linkRef1.add("Ravi");//23
	        linkRef1.add(100.24);//3
	        linkRef1.add("Manish");//4
	        linkRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        linkRef1.add(10000000);//6
	        linkRef1.add(32567);//7
	        linkRef1.add('A');//8
	        linkRef1.add("Ravi");//0 1
	        linkRef1.add(100);//1 2   
	        linkRef1.add("Ravi");//23
	        linkRef1.add(100.24);//3
	        linkRef1.add("Manish");//4
	        linkRef1.add("Can");//5
	        //VectRef1.add(true);--boolean 
	        linkRef1.add(10000000);//6
	        linkRef1.add(32567);//7
	        linkRef1.add('A');//8
	        System.out.println(linkRef1);
	        //add(index,Obj):Add the new object or insert the middle of the Vector through the index.
	        //
	       // in the middle
	        linkRef1.add(4,"123");
	        // in the begining
		
	        linkRef1.add(0,1234444);
	        //at the end
	        
	        linkRef1.add(9,"Priya");
	        System.out.println(linkRef1);
	        // vector accepting the null values.
	        linkRef1.add(10,null);
	        //size:Find the no.of.elemets or object in the Vector.
	        System.out.println(linkRef1.size());
	        // clear : it will clear all the elements present in the Vector.
	        //vectRef1.clear();
	        // Cloning:Meaning :copy
	        //if  i clone this using sop, then you need to get another vector object for cloning
	       // System.out.println(vectRef1.clone());// cloning values
	       // System.out.println(vectRef1);//just print it.
	        //what if you want to cloning values store in the another vector list.
	       LinkedList linkRef2 =new LinkedList();
	       linkRef2=( LinkedList)linkRef1.clone();//implicity
	       System.out.println(linkRef2);
	       System.out.println(linkRef1);
	       //contains: check whether the elements or object are present in the vector list.
	       
	       System.out.println(linkRef1.contains("Ravi"));// we can't pass the message 
	       //get(index):Retrive an object or element through index from the vector list
	       System.out.println(linkRef1.get(5));
	       //set(index,obj):Replace existing object or element with new elements (or)object htrough the index isndie the vector list.
	       System.out.println(linkRef1.set(11,"Dog"));
	       System.out.println(linkRef1);
	       // indexOf(Obj o):You will get the index of the elements or object from the vector list.
	       System.out.println(linkRef1.indexOf("Priya"));
	       
	       // lastIndexOf:You will get last Index of the element in the vector list
	       System.out.println(linkRef1.lastIndexOf('A'));
	       //vectRef1.clear();
	       // isEmpty(): false--> if the list contains value. true--> if the list is empty
	      System.out.println(linkRef1.isEmpty());
	      // remove(index):you want to remove element or object through the index from the vector list.
	      System.out.println(linkRef1.remove(2));
	      System.out.println(linkRef1);
	      // remove(object):You will the pass the value as object.
	      System.out.println(linkRef1.remove("Ravi"));
	      System.out.println(linkRef1);
	      //Collections.sort: if you want to sort all the element in the form of ascending order only ;Vector list must have same kind of the(homogenous  datatype_.
	      // if it is not, throws an exception "ClassCastException" for hetergenenous data type.if it is ,it will sort.
	      LinkedList linkRef3=new LinkedList();
	      linkRef3.add(200);
	      linkRef3.add(100);
	      linkRef3.add(300);
	      Collections.sort(linkRef3);
	      System.out.println(linkRef3); 
	   
	   //Collection.sort(vectRef2);
	      // Order of insertion:
	 /*  Vector vectRef2=new Vector();
	   vectRef2.add("200");
	   vectRef2.add("100");
	   vectRef2.add("300");
	   System.out.println(vectRef2)*/; 		

	}

}
