package arraydemo;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,9};
		int totalSum=0;
		int missingNum=0;
		/*for(int num:arr) {
			totalSum=totalSum+num;
		}*/
		for(int i=0;i<=arr.length-1;i++) {
			missingNum=arr[arr.length-1]-arr[i];
			for(int j=0;j<arr.length-1;j++) {
			if(missingNum!=arr[j])
				System.out.println(missingNum);
			break;
			}	
			}
		}
	}

