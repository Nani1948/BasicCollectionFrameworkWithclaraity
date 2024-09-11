package StringClassExample;

public class StringFunctions {

	public static void main(String[] args) {
		// length()-it used to find the length of the string.
		String s1="navya";
		//System.out.println(s1.length());
		// or 
		int lengthFunctions=s1.length();
	
		System.out.println(lengthFunctions);
		//trim()-it used to remove whitespace from both end of the string but not in the middle of the string.
		String s2="   My  name  is  cat          ";
		System.out.println(s2.trim());
		// charAt()-it is used to return the char value of specified index position.
		System.out.println(s1.charAt(4));
		//indexOf()-Returns the position of the first found occurrence of specified characters in a string
		// indexOf('A)- if the non-present character in that given string the answer will be'-1'
		System.out.println(s1.indexOf('A'));
		// convert astring to Uppercase
		System.out.println(s1.toUpperCase());
		//Convert a string to lower case.
		System.out.println(s1.toLowerCase());
		String s3="Hello";
		String s4="World";
	// Returns a new string which is the substring of a specified string
		// s2.substring (int beginIndex)
	System.out.println(s2.substring(4));
	// s2.substring(int beginIndex , int endIndex));
	System.out.println(s2.substring(2,18));
	// concat:combine two string into single string
	System.out.println(s3.concat(s4));
	//System.out.println(s4.contains('W'));
//contains: check whether specified the charcter value or world are present or not in the given string.	
System.out.println(s3.contains("Z"));
System.out.println(s3.startsWith("z"));
//startwith-Check whether a string start with specfied character
System.out.println(s3.startsWith("H"));
System.out.println(s3.startsWith("l"));
System.out.println(s3.startsWith("W"));
//endsWith()-Checks whether a string ends with the specified character(s)
System.out.println(s4.endsWith("d"));
System.out.println(s4.endsWith("l"));
System.out.println(s4.endsWith("H"));

	}

}
