package arraydemo;

public class FindLargestElementOFK {
	public static  int findKthLargest(int[] nums, int k) {
	     //    int max=nums[0];min=nums[0];
	       for(int i=0;i<nums.length;i++){
	        for(int j=i+1;j<nums.length;j++){
	            if(nums[i]>nums[j]){
	                int temp=nums[i];
	                nums[i]=nums[j];
	                nums[j]=temp;
	            }
	        }
	       }
	        
	        return nums[nums.length-k];
	    }
	public static void main(String[] args) {
	int []nums= {8,9,10,11,12,1,5,3};
	int k=4;
	int res=FindLargestElementOFK.findKthLargest(nums,k);
	System.out.println(res);
	

	}

}
