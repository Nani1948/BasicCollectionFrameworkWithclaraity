package program.string;

public class RemoveSpecialAndJunkInAString {

	public static void main(String[] args) {
	 String removeSpecial1="384u82u!!!!!!!!!&122u43#######";
	 
	 String removeSpecial2="!@#$%%%1234QUEEN";
	 // Regular Expression:[^a-zA-Z0-9]
	 
	 removeSpecial1=removeSpecial1.replaceAll("[^a-zA-Z0-9]","");
	 System.out.println(removeSpecial1);
	 removeSpecial2=removeSpecial2.replaceAll("[^a-zA-Z0-9]","");
	 System.out.println(removeSpecial2);

	}

}
