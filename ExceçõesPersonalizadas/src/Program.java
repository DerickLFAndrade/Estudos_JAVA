import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program{
public static void main (String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Room number: ");
	int number = sc.nextInt();
	System.out.print("Check-In date (DD/MM/YYYY): ");
	Date checkIn = sdf.parse(sc.next());
	
	System.out.print("Check-Out date (DD/MM/YYYY): ");
	Date checkOut = sdf.parse(sc.next());
	
	if(!checkOut.after(checkIn)) {
		System.out.println("Error in reservation: Check-out must be after check-in date");
	} else {
		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
		
		System.out.println();
		System.out.println("Enter data to uptade  the reservation:");
		System.out.print("Check-In date (DD/MM/YYYY): ");
		checkIn = sdf.parse(sc.next());
		
		System.out.print("Check-Out date (DD/MM/YYYY): ");
		checkOut = sdf.parse(sc.next());
		
		String error = reservation.updateDates(checkIn, checkOut);
		if(error != null) {
			System.out.println(error);
		}
		else {			
			System.out.println("Reservatuin: " + reservation);
		}
		
	}
	
	

	sc.close();
}
}
