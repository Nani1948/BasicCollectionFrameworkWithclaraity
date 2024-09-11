package CollectionsDemo;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Vector;
public class PriorityQueueClass {
	public static void main(String[] args) {
		PriorityQueue priority1=new PriorityQueue(); 
		//It doesn't follow the index and insertion order of the element
	      //add(obj):Add the new object or element at the end of the vector list.  
		// Adding all the element in the collections
	       // It is a following the indexing because the random access is possible.
	        //It is a following the order of insertion
		// it can accept the homogenous  data type
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		
		// PriorityQueue can't accept the hetergenous data and throw an classCastException
		//priority1.add(100);
		//priority1.add(983775);
		//priority1.add(100.40);
		 //PriorityQueue  doesn't accept the null value.
		//priority1.add(null); // java.lang.NullPointerException
		System.out.println(priority1);
		//Dynamic Size
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Cat");
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		priority1.add("Ravi");
		//priority1.add(100);
		System.out.println(priority1);
		// You can't insert the element in the middle , at the end , starting of the Queue.
		// It is throwing an compilation time issue.
		//add(index,Obj):Add the new object or insert the middle of the Vector through the index.
       // in the middel
		//priority1.add(1,"Priya");
		//
		//size:Find the no.of.elemets or object in the Vector.
        System.out.println(priority1.size());
	
     // clear : it will clear all the elements present in the Vector.
      // it is not  clear all the element
        // there is no (add(index,Object),clone,get,set,indexOf,lastindexOf)methods.it is compile time 
      //  priority1.clear();
        //contains: check whether the elements or object are present in the vector list.
        
        System.out.println(priority1.contains("Ravi"));// we can't pass the message 
        // isEmpty(): false--> if the list contains value. true--> if the list is empty
        System.out.println(priority1.isEmpty());
        // remove(index):you want to remove element or object through the index from the vector list.
        System.out.println(priority1.remove(2));
        System.out.println(priority1);
        // remove(object):You will the pass the value as object.
        System.out.println(priority1.remove("Ravi"));
        System.out.println(priority1);
        //There is no sorting the method in the priorityQueue.,it is compile time issue.
        //Collections.sort: if you want to sort all the element in the form of ascending order only ;Vector list must have same kind of the(homogenous  datatype_.
        // if it is not, throws an exception "ClassCastException" for hetergenenous data type.if it is ,it will sort.
        /*PriorityQueue p2=new PriorityQueue();
        p2.add(200);
        p2.add(100);
        p2.add(300);
        Collections.sort(p2);
        System.out.println(p2);*/ 
        
	}

}
