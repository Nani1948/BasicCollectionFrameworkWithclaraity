package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class MiniumElementInArrayList {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int res=MiniumElementInArrayList.minimumElement(arr);
		System.out.println("Minimum Element:"+res);


	}
    public static int minimumElement(int[] arr) {
    	List<Integer> listOfElement=new ArrayList<>();
    	for(int num:arr) {
    		listOfElement.add(num);
    	}
    	int min=listOfElement.get(0);
    	for(int i=0;i<listOfElement.size();i++) {
    		if(listOfElement.get(i)<min) {
    			min=listOfElement.get(i);
    		}
    	}
    	return min;
    	
	}

}
