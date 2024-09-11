package inheritance12;

public class SwiggyOrderItemsDetails { 
	
	int chickenBiryani=250;
    int vegBiryani=200;
    int muttonBiryani=300;
    int familyPackBiryani=600;
     int  deliveryCharge=20;
	  double tax=0.18;
	 public void orderItems() {
	  double total_Amount=chickenBiryani+vegBiryani+muttonBiryani+familyPackBiryani+deliveryCharge;
	 double dnum=Double.valueOf(total_Amount);
	 System.out.println("Total _Amount Before Tax :"+dnum);
	 double final_AmountAfterTax= tax*dnum;
	 System.out.println("Final Amount After Tax:"+ final_AmountAfterTax);			
}
	 
}