package AccessSpecifier1;

public class AccessSpeifierWithoutInheritanceChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpeifierWithInheritanceChildClass ac=new AccessSpeifierWithInheritanceChildClass();
		ac.man1();
		//ac.multiplication();//protectd
		//ac.printTheNumber();// default-compile time issue-
		//ac.areaOfCircle();//pRivate-compile time issue-
	}

}
