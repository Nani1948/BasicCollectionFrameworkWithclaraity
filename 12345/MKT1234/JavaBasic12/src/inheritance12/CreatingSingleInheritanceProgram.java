package inheritance12;

public class CreatingSingleInheritanceProgram {
  int num=4;
  
  double radius=2.4;
  void printTheEvenNumber() {
	  if(num%2==0) {
		  System.out.println("The Number is even:"+num);
	  }
	  else
		  System.out.println("The Nuumber is odd:"+num);
  }
  
   void printTheLeapYear(int n) {
	  if(n%4==0) {
		 System.out.println("This is a leap year"); 
	  }
	  else {
		  
		  System.out.println("This is not leap year"); 
	  }
	  
  }
	}


