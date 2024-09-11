package CollectionsDemo;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSetExample {

	public static void main(String[] args) {
	TreeSet treeRef1=new TreeSet();
	//It doesn't follow insertion order of the element & 
	// it doesn't follow index manner
	//It is a dynamic in size
	//It doesn't accept the null values.at run time,you will get runtime error(java.lang.NullPointerException)
	// There is no collections.sort method in the treeset.
	//It doesn't allow the duplicate values.
	// It doesn't accept the heterogeneous data.
	//Adding the Element// It doesn't accept the hetergenous data.
	/*treeRef1.add("Ravi");//0 1
	treeRef1.add(100);//1 2   
	treeRef1.add("Ravi");//23
	treeRef1.add(100.24);//3
	treeRef1.add("Manish");//4
	treeRef1.add("Can");//5
	System.out.println(treeRef1);*/
	//Adding the element:it does accept the homogenous  data
	// it doesn't allow the duplicate values and print that values only once
	treeRef1.add("Priya");
	treeRef1.add("Ravi");
	treeRef1.add("Radha");
	treeRef1.add("Geetha");//1 2   
	treeRef1.add("Shwetha");//23
	treeRef1.add("Shwetha");//3
	System.out.println(treeRef1);
	
	//Dynamic size
	treeRef1.add("Shankar");
	treeRef1.add("John");
	treeRef1.add("Cat");
	treeRef1.add("Dog");
	treeRef1.add("Mat");
	treeRef1.add("Goat");
	treeRef1.add("Fish");
	System.out.println(treeRef1);
	// There is no insertion at the start, at the end, in the middle.
	//There is no get, set methods
	// null
	//treeRef1.add(null);//java.lang.NullPointerException
	//System.out.println(treeRef1);
	
	//// clear : it will clear all the elements present in the Vector.
    //treeRef1.clear();
    // Cloning:Meaning :copy
    //if  i clone this using sop, then you need to get another vector object for cloning
   // System.out.println(vectRef1.clone());// cloning values
   // System.out.println(vectRef1);//just print it.
    //what if you want to cloning values store in the another vector list.
   TreeSet s2=new TreeSet();
   s2=(TreeSet)treeRef1.clone();
   System.out.println(s2);
   System.out.println(treeRef1);
   //contains: check whether the elements or object are present in the vector list.
   
   System.out.println(treeRef1.contains("Ravi"));// we can't pass the message 
// isEmpty(): false--> if the list contains value. true--> if the list is empty
   System.out.println(treeRef1.isEmpty());
   // remove(index):you want to remove element or object through the index from the vector list.
   System.out.println(treeRef1.remove(2));
   System.out.println(treeRef1);
   // remove(object):You will the pass the value as object.
   System.out.println(treeRef1.remove("Ravi"));
   System.out.println(treeRef1);
   //Collections.sort: if you want to sort all the element in the form of ascending order only ;Vector list must have same kind of the(homogenous  datatype_.
   // if it is not, throws an exception "ClassCastException" for hetergenenous data type.if it is ,it will sort.
   /*TreeSet t4=new TreeSet();
   t4.add(200);
   t4.add(100);
   t4.add(300);
   Collections.sort(t4);
   System.out.println(t4); */
	

	}

}
