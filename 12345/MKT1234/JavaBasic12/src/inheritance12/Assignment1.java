package inheritance12;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Assignment1 {
   public static void main(String[]args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter chickenBiryani,vegBiryani,muttonBiryani,familyPackBiryani,deliveryCharge");
	   int chickenBiryani=scan.nextInt();
       int vegBiryani=scan.nextInt();
       int muttonBiryani=scan.nextInt();
       int familyPackBiryani=scan.nextInt();
       int deliveryCharge=scan.nextInt();
	   double tax=scan.nextDouble();
	   
	   System.out.println("Enter Chicken Biryani:"+     chickenBiryani+"/-");
	   System.out.println("Enter Veg Biryani:"+         vegBiryani+"/-");
	   System.out.println("Enter Mutton Biryani:"+      muttonBiryani+"/-");
	   System.out.println("Enter Family Pack Biryani:"+ familyPackBiryani+"/-");
	   System.out.println("Enter Delivery Charge:"+     deliveryCharge+"/-");
	   System.out.println("Enter Tax:"+tax);
	   int total_AmountOfAllItems= chickenBiryani+  vegBiryani+muttonBiryani+familyPackBiryani+deliveryCharge;
	   double double1=Double.valueOf(total_AmountOfAllItems);
	   System.out.println("Total_Amount of all items:"+ double1);
	   double Total_Amount= tax*double1;
	   System.out.println("Total_Amount after tax:"+ Total_Amount);
	   
       boolean newCustomer=scan.nextBoolean();
       System.out.println("New Customer"+newCustomer);
       /*boolean oldCustomer=scan.nextBoolean();
       System.out.println("Old Customer"+oldCustomer);*/
       if(newCustomer==true) {
    	   int flat=scan.nextInt();
          
           System.out.println("Flat :"+ flat);
            
           String code =scan.next("FIRST");
           System.out.println("Apply Coupon:"+code);  
    	   double final_AmountOfFirstTimeUser= Total_Amount-flat;
    	   System.out.println("Final_Amount of First Time User is:"+final_AmountOfFirstTimeUser);
       }
       else if(newCustomer==false) {
    	   System.out.println(" I am an old customer");
       }
       else if(!newCustomer==true && Total_Amount >=350) {
    	   {
    		  double superSwiggyUser= 20%Total_Amount;
    		  System.out.println(" Final Amount of Super Swiggy User"+superSwiggyUser);
    	   }
    	   
    	   
       }
   }
}
