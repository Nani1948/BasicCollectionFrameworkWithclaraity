package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class FindMaximumElementUsingArrayList {
    public static int maximumElement(int []arr){
       
    	List<Integer> listOfElement=new ArrayList<>();
    	for(int num:arr) {
    		listOfElement.add(num);
    	}
    	int max=listOfElement.get(0);
    	for(int i=0;i<listOfElement.size();i++) {
    		if(listOfElement.get(i)>max) {
    			max=listOfElement.get(i);
    		}
    		
    	}
    	return max;
    	
    	
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
	int res=FindMaximumElementUsingArrayList.maximumElement(arr);
	System.out.println("MaximumElement:"+res);

	}

}
