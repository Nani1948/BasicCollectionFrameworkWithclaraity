package arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseTotalArrayUsingArraylist {
	public static void reverseArray(int []arr) {
		   List<Integer> orgList = new ArrayList<>();
		   for(int num:arr) {
			   orgList.add(num);
		   }
		   System.out.println("Original ArrayList:"+orgList);
		   Collections.reverse(orgList);
		   System.out.println("Reverse An ArrayList:"+ orgList);
	}
	public static void reverseArrayWithOutBuilt(int []arr) {
		   List<Integer> orgList = new ArrayList<>();
		   for(int num:arr) {
			   orgList.add(num);
		   }
		   System.out.println("Original ArrayList:"+orgList);
		   int start=0;
		   int end=orgList.size()-1;
		   while(start< end) {
			   int temp=orgList.get(start);
			   orgList.set(start,orgList.get(end));
			   orgList.set(end, temp);
			   //Move pointer
			   start++;
			   end--;
			   
		   }
		   System.out.println("Reverse ArrayList:"+orgList);
	}
	public static void main(String []args) {
		int[] arr = {1, 2, 3, 4, 5};
		 ReverseTotalArrayUsingArraylist.reverseArray(arr);
		 ReverseTotalArrayUsingArraylist.reverseArrayWithOutBuilt(arr);
		
	}

}
