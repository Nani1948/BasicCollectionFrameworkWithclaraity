package arraydemo;

import java.util.Arrays;

public class RemoveDuplicateElements {
	public static void main(String[]args) {
		int arr[]= {9,9,9,8,8,8,7,3,2,2,2,2,1,1,1};
		RemoveDuplicateElements.removeDuplicateElementFromUnsorted(arr);
	}

	public  static void removeDuplicateElementFromUnsorted(int[] arr) {
		int j=0;
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
			
		}
		temp[j++]=arr[arr.length-1];
		System.out.println("Remove Duplicate:");
		for(int k=0;k<j;k++) {
			System.out.print(temp[k]+" ");
		}
	}

}
