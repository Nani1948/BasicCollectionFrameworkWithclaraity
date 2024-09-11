package AccessSpecifier1;

public class AccessSpeifierWithInheritanceChildClass extends AccessSpecifierWithInheritanceConcept1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpeifierWithInheritanceChildClass ac=new AccessSpeifierWithInheritanceChildClass();
		ac.man1();
		ac.multiplication();
		//ac.printTheNumber();// default-compile time issue-no access outisde the package by becoming the sub class
		//ac.areaOfCircle();//pRivate-compile time issue-no access outisde the package by becoming the sub class.
		
	}

}
