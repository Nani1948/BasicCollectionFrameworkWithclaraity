package Inheritaance;
class Teacher {
 String designation ="Teacher";
 String collegeName ="Beginnersbook";
}
  class ComputerTeacher extends Teacher
  {
	  void does() 
	  {
		  System.out.println("Teacher......");
		  System.out.println(designation);
	       System.out.println(collegeName);
	  }
  }
	

