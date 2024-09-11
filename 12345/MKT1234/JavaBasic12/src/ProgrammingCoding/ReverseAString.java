package ProgrammingCoding;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// using + (String concentation)operator
		String s="ABCDE";
		String rev=" ";
		/*int len=s.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev)*/;
		
		// Logic 2:String Buffer
		//StringBuffer sb=new StringBuffer(s);
		//StringBuffer rev=sb.reverse();
		//System.out.println(rev);
		
		// Logic 3 using array
		char a[]=s.toCharArray();
		int len=s.length();
		for (int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
		}

	}


