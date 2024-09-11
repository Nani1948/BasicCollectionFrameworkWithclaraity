package program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class PrintTodayDateAndTime {

	public static void main(String[] args) {
	// Creating a new object of the class Date
	
		    SimpleDateFormat formatter = new SimpleDateFormat(" DD/MM/yyyy hh:mm:ss z");  
		    Date  date=new Date();
		    formatter.setTimeZone(TimeZone.getTimeZone("PST"));
		    System.out.println(formatter.format(date)); 


}
}
