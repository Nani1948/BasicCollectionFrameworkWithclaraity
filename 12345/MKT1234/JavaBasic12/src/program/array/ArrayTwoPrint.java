package program.array;

import java.util.Arrays;

public class ArrayTwoPrint {
	int a[]= {2,1,5,6};
    int b[]= {2,2,2,2,1,1,1,1,5,5,5,5}; 
    int i,j,temp=0;
	void countOfOccurence() {
		
		for( i=0;i<a.length;i++) {	
			 temp = a[i];
			 b[temp]++;	
		
	    for( j=0;j<b.length;j++) {
	    	
			if(a[i]==b[j]) {
				
				System.out.printf("%d occurs %d time\n",i, b[i]);
		}
	    }
	}
	}
	public static void main(String []args) {
		
	    ArrayTwoPrint s =new ArrayTwoPrint ();
	    s.countOfOccurence();
	    
	}
					
	}