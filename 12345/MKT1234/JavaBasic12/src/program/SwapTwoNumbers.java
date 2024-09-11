package program;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	
		int i =30;
		int j=60;
	   System.out.println(" Before Swapping:" +i+ " " +j);
	   
	   /*
	   j=j+i;// 60+30=90
	   i=j-i;// 90-30=60
	   j=j-i;// 60-30=30
	   
	   System.out.println("After Swapping:" +i +" " +j);*/
		
	   
	   j=j*i; //1800
	   
	   i=j/i;// 1800/30=60
	   j=j/i; // 
	   System.out.println("After Swapping:" +i +" " +j);  
	   
	  
		
		
	   
	   
	   

}
}
