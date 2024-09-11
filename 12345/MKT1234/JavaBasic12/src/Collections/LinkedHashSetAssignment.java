package Collections;

import java.util.LinkedHashSet;
public class LinkedHashSetAssignment {
	public static void main(String[] args) {
		 LinkedHashSet linkHash1=new LinkedHashSet();
			//It doesn't follow insertion order of the element & 
					// it does follow index manner
					//It is a dynamic in size
					//It does accept the null values.
					// There is no a collections.sort method in the treeset.you will get complile time issue
					//It doesn't allow the duplicate values.
					// It accept the heterogeneous data.
			  // clear is happening
			  //Adding the element
			  linkHash1.add(100);//1 2   
			  linkHash1.add("Ravi");//23
			  linkHash1.add(100.24);//3
			  linkHash1.add("Manish");//4
			  linkHash1.add("Can");//5
				System.out.println(linkHash1);
				linkHash1.add(null);
				System.out.println(linkHash1);
				
				// Dynamic in size
				 linkHash1.add(100);//1 2   
				  linkHash1.add("Ravi");//23
				  linkHash1.add(100.24);//3
				  linkHash1.add("Manish");//4
				  linkHash1.add("Can");//5
				  linkHash1.add(100);//1 2   
				  linkHash1.add("Ravi");//23
				  linkHash1.add(100.24);//3
				  linkHash1.add("Manish");//4
				  linkHash1.add("Priya");//5
				  linkHash1.add(100);//1 2   
				  linkHash1.add("Ravi");//23
				  linkHash1.add(100.24);//3
				  linkHash1.add("Manish");//4
				  linkHash1.add("FanTRUE");//5
				  System.out.println(linkHash1);
				  linkHash1.add(100);//1 2   
				  linkHash1.add("Ravi");//23
				  linkHash1.add(100.24);//3
				  linkHash1.add("Manish");//4
				  linkHash1.add("Can");//5
				  linkHash1.add(100);//1 2   
				  linkHash1.add("Ravi");//23
				  linkHash1.add(100.24);//3
				  linkHash1.add("Manish");//4
				  linkHash1.add("Fan");//5
				  System.out.println(linkHash1);
				  linkHash1.add(100);//1 2   
				  linkHash1.add("Ravi");//23
				  linkHash1.add(100.24);//3
				  linkHash1.add("Manish");//4
				  linkHash1.add("Can");//5
				
				  
				  System.out.println(linkHash1);
				// clear : it will clear all the elements present in the Vector.
				 //Collection.sort(vectRef2);
			      // Order of insertion:
			  /*LinkedHashSet h4=new LinkedHashSet();
			   h4.add(200);
			   h4.add(100);
			   h4.add(300);
			   Collections.sort(h4);
			   System.out.println(h4)*/; 	


	}

}
