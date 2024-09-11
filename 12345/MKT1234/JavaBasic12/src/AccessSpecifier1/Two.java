package AccessSpecifier1;

public class Two {

	public static void main(String[] args) {

		One o=new One();
		o.man();
		o.man1();
	
		//o.man2();-private
		o.man3();
		System.out.println(" I am not able to accessing the private member & remain access speciifer are able to acccess ");

	}

}
