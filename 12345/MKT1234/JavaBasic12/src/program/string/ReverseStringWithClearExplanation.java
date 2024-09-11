package program.string;
public class ReverseStringWithClearExplanation {
	public static void main(String[] args) {
		String s="Selenium";
		//System.out.println(s.reverse);it is given compiler issue because there is no reverse function in the string class because  string is immutable
		// immutable -it can unmodifable or unchangeable.
		// Once string is created its data or state . 
		//it can't be chaged but a new string object is created.
		// 1.find the length of the string.
		// i>=0;becuase S start with 0
		// 1.using for loop
		/*int lengthOfGivenString=s.length();
		String rev=" ";
		
		for(int i=lengthOfGivenString-1;i>=0;i--) {
		
		rev=rev +s.charAt(i);// Return the character which is available on the specific index.
		// rev why, i am appendingbecuase the first time reverse is blank.
         // blank+m
		// m+u=mu
		//mu+i=mui
	}
System.out.println(rev);*/
		
		// 2. using String Buffer class
		//1. Create StringBuffer object
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse()); //StringBuffer is a mutable class
		// In StringBuffer class, we have reverse function but not in the String class.
		
		
}
}