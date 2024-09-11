package program.array;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {1,5,3,4,6};
		int search_ele=6;
		boolean flag=false;
		for (int i=0;i<a.length-1;i++) {
			//System.out.println(a[i]);
			
			if(search_ele==a[i]) {
				System.out.println("Element found at:" +i);
				flag=true;
				break;
			}
			 
		}
        if(flag==false) {
		System.out.println("Element not found"); 
	}
	}

}
