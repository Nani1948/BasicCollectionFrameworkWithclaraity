package CollectionsDemo;
import java.util.HashSet;
import java.util.Vector;
public class HashSetCollections {
	public static void main(String[] args) {
		//It doesn't follow insertion order of the element & 
		// it doesn't follow index manner
		//It is a dynamic in size
		//It does accept the null values.
		// There is a collections.sort method in the treeset.
		//It doesn't allow the duplicate values.
		// It accept the heterogeneous data.
		// 
	HashSet hashRef1=new HashSet();
	hashRef1.add(100);//1 2   
	hashRef1.add("Ravi");//23
	hashRef1.add(100.24);//3
	hashRef1.add("Manish");//4
	hashRef1.add("Can");//5
	System.out.println(hashRef1);
	//null
	hashRef1.add(null);
	System.out.println(hashRef1);
	// clear : it will clear all the elements present in the Vector.
	hashRef1.clear();
	System.out.println(hashRef1);
	
	//Dynamic in size
	hashRef1.add(100);//1 2   
	hashRef1.add("Ravi");//23
	hashRef1.add(100.24);//3
	hashRef1.add("Manish");//4
	hashRef1.add("Can");//5
	hashRef1.add(100);//1 2   
	hashRef1.add("Ravi");//23
	hashRef1.add(100.24);//3
	hashRef1.add("Manish");//4
	hashRef1.add("Can");//5
	hashRef1.add(100);//1 2   
	hashRef1.add("Priya");//23
	hashRef1.add(100.24);//3
	hashRef1.add("Fan");//4
	hashRef1.add("Can");//5hashRef1.add(100);//1 2   
	hashRef1.add("Ravi");//23
	hashRef1.add(100.24);//3
	hashRef1.add("Manish");//4
	hashRef1.add("Can");//5
	System.out.println(hashRef1);
	  HashSet h2=new HashSet();
      h2=(HashSet)hashRef1.clone();
      System.out.println(h2);
      System.out.println(hashRef1);
      //contains: check whether the elements or object are present in the vector list.
      
      System.out.println(hashRef1.contains("Ravi"));// we can't pass the message 
      //get(index):Retrive an object or element through index from the vector list
      /*System.out.println(hashRef1.get(5));
      //set(index,obj):Replace existing object or element with new elements (or)object htrough the index isndie the vector list.
      System.out.println(hashRef1.set(11,"Dog"));
      System.out.println(hashRef1);
      // indexOf(Obj o):You will get the index of the elements or object from the vector list.
      System.out.println(hashRef1.indexOf("Priya"));
      
      // lastIndexOf:You will get last Index of the element in the vector list
      System.out.println(hashRef1.lastIndexOf('A'));
      //vectRef1.clear();*/
    //Collection.sort(vectRef2);
      // Order of insertion:
  HashSet h3=new HashSet();
   h3.add("200");
   h3.add("100");
   h3.add(100.24);
   System.out.println(h3); 	 
	
	}

}
