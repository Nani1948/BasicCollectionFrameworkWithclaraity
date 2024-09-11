package program;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      int number =5;
	      String size;
		switch(number) {
		case 1:
			
			  size= "Small";
			  System.out.println("size of dress: "+size);
			  break;
		case 2:
			 size= "Medium";
			 System.out.println("size of dress: "+size);
			 break;
		case 3:
			  size= "Large";
			  System.out.println("size of dress: "+size);
			  break;
			
		case 4:
			  size= "Large";
			  System.out.println("size of dress: "+size);
			  break;
			
			default:
				size="Zero";
				System.out.println("size of dress: "+size);
				
		}

	}

}
