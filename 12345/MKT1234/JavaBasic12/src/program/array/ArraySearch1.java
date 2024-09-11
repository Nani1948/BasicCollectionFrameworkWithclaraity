package program.array;

public class ArraySearch1 {

	public static void main(String[] args) {
	 	int arr[] = {1,5,7,1,5};
		int search1[] = {1,5,7,8,1,2,4,5,7,1,9,5,8};	
		for(int i=0;i<arr.length-1;i++) 
		{
			System.out.println("arr [] is data:" +arr[i]);
			System.out.println("Search [] is data:" +search1[i]);
			if(arr[i]==search1[i]) 
			{
				System.out.println("Element found: "+ search1[i]);
			}
		}
	}

}
