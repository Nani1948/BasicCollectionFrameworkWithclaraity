package Inheritance;

class CourseRegisteration{
	public static void details(String name, int id, String phoneNumber) {
		System.out.println("Student Name:"+name);
		System.out.println(" ID:"+id);
		System.out.println("Phone Number:"+phoneNumber);
	}
	void contactPerson(String name, int id, String phoneNumber) {
		System.out.println("Student Name:"+name);
		System.out.println(" ID:"+id);
		System.out.println("Phone Number:"+phoneNumber);	
	}
}
class Process extends CourseRegisteration{
	void processCompleted() {
		System.out.println(" Process is completed");
	}
}
public class HybridConcept3 extends Process{
	
	public static void application() {
		System.out.println("Application is approved");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Hybrid Concept
		
		details("Kiran",102,"892372893");
		HybridConcept3 h=new HybridConcept3();
		h.processCompleted();
		application();//static method
		h.contactPerson("John",101,"873375892373");
		HybridConcept3ChildClass hc3c=new HybridConcept3ChildClass();
		hc3c.rejected();
		
		
	}

}
