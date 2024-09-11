package class12;

public class CarMain {

	public static void main(String[] args) {
			Car porsche=new Car();
			Car holden=new Car();
			//porsche=null;-->nullpointer exception
			// TODO Auto-generated method stub
	System.out.println("Model is:"+porsche.getModel());
	porsche.setModel("Carrera");
	System.out.println("Model is:"+porsche.getModel());
	
	}

}
