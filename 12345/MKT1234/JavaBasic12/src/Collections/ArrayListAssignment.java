package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		// You are adding element  in the collections
				// You can insert the element in  the form of the order of insertion.
		        al.add("Nandhini");
		        al.add("Ravi");
		        al.add("Shwetha");
		        al.add("10.11");
		        // if you want to add an element through index
		        // You can insert the element at the start , middle, ending of the list throguh the index in the form of order of insertion 
		       //ArrayListCan be dynamic.Ex:
		        al.add(0,100000);
		        al.add(1,"Asha");
		        al.add(5,"Manish");
		        al.add(4,"Shw");
		        al.add("Nandhini");
		        al.add("Ravi");
		        al.add("Shwetha");
		        al.add("10.11");
		        al.add("Nandhini");
		        al.add("Ravi");
		        al.add("Shwetha");
		        al.add("10.11");
		        al.add("Nandhini");
		        al.add("Ravi");
		        al.add("Shwetha");
		        al.add("10.11");
		        al.add("Nandhini");
		        al.add("Ravi");
		        al.add("Shwetha");
		        al.add("10.11");
		        al.add("Nandhini");
		        al.add("Ravi");
		        al.add("Shwetha");
		        al.add("10.11");
		        al.add("Nandhini");
		        al.add("Ravi");
		        al.add("Shwetha");
		        al.add("10.11");
		        al.add("Nandhini");
		        al.add("Ravi");
		        al.add("Shwetha");
		        al.add("10.11");
		        
		        // adding null values.
		        al.add(null);
		        // clearing all the element in the ArrayList
		       
		        //al.clear();
		        // remove(index)the element that was removed from the listThrows:IndexOutOfBoundsException - if the index is out of range(index < 0 || index >= size())
		        System.out.println(al.remove(5));
		        //remove(Object o):the element that was removed from the listThrows:IndexOutOfBoundsException - if the index is out of range(index < 0 || index >= size())
		        System.out.println(al.remove("Manish"));
		        // Cloning:Returns a shallow copy of this ArrayList instance. (Theelements themselves are not copied.)
		        ArrayList am=new ArrayList();
		        am=(ArrayList)al.clone();
		        System.out.println(am);
		        System.out.println(al);
		        // Contains:true if this list contains the specified element
		     System.out.println(al.contains("Manish"));
		     //get :Returns the element at the specified position in this list.
		     System.out.println(al.get(5));
		     // indexOf:Returns the index of the first occurrence of the specified elementin this list, or -1 if this list does not contain the element.More formally, returns the lowest index i such that Objects.equals(o, get(i)),or -1 if there is no such index.
		     System.out.println(al.indexOf("Ravi"));
		     // lastIndexof:the index of the last occurrence of the specified element inthis list, or -1 if this list does not contain the element
		     System.out.println(al.lastIndexOf("Manish"));//-1
		     System.out.println(al.isEmpty());//false
		     // IsEmpty-true if this list contains no elements
		   // al.clear();
		   // System.out.println(al.isEmpty());//true
		    // Remove:Returns:the element that was removed from the list and Throws:IndexOutOfBoundsException - if the index is out of range(index < 0 || index >= size())
		    System.out.println(al.remove(0));
		    // Sort can be done with homogenous data in the form of ascending sort.
		    // Order of the insertion
		    ArrayList a3=new ArrayList();
		    a3.add(1000);
		    a3.add(1000000);
		    a3.add(899334);
		    System.out.println(a3);
		    Collections.sort(a3);//-homogenous data
		    
		    ArrayList a4=new ArrayList();
		    a4.add("A");
		    a4.add("B");
		    a4.add("C");
		    System.out.println(a4);
		    Collections.sort(a4);// 
		    // Sort can't be done with hetergenous data
		    // it will not throug an complie time issue, at runtime throws an ClassCastException.
		    /*ArrayList a5=new ArrayList();
		    a5.add("A");
		    a5.add(100);
		    a5.add(1000.12);
		    Collections.sort(a5)*/;
		    
		    
		    
		     
			}

		}


