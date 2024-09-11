package class12;

public class StudentClass {
	int sid;
	String sname;
	char grade;
	StudentClass(int id, String name,char g){
		sid=id;
		sname=name;
		grade=g;
	}
	void getValues(int id, String name,char g) {
		sid=id;
		sname=name;
		grade=g;
	}
	
	void display() {
		System.out.println(sid+ " " +sname+ " " +grade);
	}

}
