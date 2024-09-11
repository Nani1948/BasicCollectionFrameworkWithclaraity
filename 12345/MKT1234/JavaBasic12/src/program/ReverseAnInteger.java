package program;

public class ReverseAnInteger {

	public static void main(String[] args) {
		//1.using algo
		/*int num=12345;
		int rev=0;
		while(num!=0) {
		rev=rev*10+num%10;//5 4 32 1
		num=num/10;//12

	}
		System.out.println("Reverse num:"+rev);*/
		
		// 2. Using StringBuffer method
		long num=123456;
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());

}
}