package inheritance12;

public class TotalSwiggy {

	public static void main(String[] args) {
		int chickenBiryani=250;
	    int vegBiryani=200;
	    int muttonBiryani=300;
	    int familyPackBiryani=600;
	     int  deliveryCharge=20;
		  double tax=0.18;
		  double total_Amount=chickenBiryani+vegBiryani+muttonBiryani+familyPackBiryani+deliveryCharge;
		 double dnum=Double.valueOf(total_Amount);
		 System.out.println("Total _Amount Before Tax :"+dnum);
		 double final_AmountAfterTax= tax*dnum;
		 System.out.println("Final Amount After Tax:"+ final_AmountAfterTax);			
        int ch=1;
        boolean newCustomer=false;
        
        String code="FIRST";
        double flat=100.00;
        switch(ch){
        	
        	case 0:
        		if(newCustomer==true) {
        		System.out.println("ApplyCoupon:"+code);
        		double final_AmountOfNewCustomer= final_AmountAfterTax-flat;
        		System.out.println("final_AmountOfNewCustomer:"+final_AmountOfNewCustomer);
        		}
        		else {
        		System.out.println("I am a old customer");
        		}
        	case 1:
        		if(newCustomer==false&& final_AmountAfterTax >=350) {
        			double final_AmountSuperSwiggyUser=(20/100)*final_AmountAfterTax;
        		System.out.println( final_AmountSuperSwiggyUser);
        		}
        }
        		
	}

}
