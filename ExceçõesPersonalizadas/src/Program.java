import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program{
public static void main (String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);
	
	try {
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-In date (DD/MM/YYYY): ");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.print("Check-Out date (DD/MM/YYYY): ");
		Date checkOut = sdf.parse(sc.next());
		
		
		System.out.println("Error in reservation: Check-out must be after check-in date");
		
		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
		
		System.out.println();
		System.out.println("Enter data to uptade  the reservation:");
		System.out.print("Check-In date (DD/MM/YYYY): ");
		checkIn = sdf.parse(sc.next());
		
		System.out.print("Check-Out date (DD/MM/YYYY): ");
		checkOut = sdf.parse(sc.next());
		
		reservation.updateDates(checkIn, checkOut);	
		System.out.println("Reservatuin: " + reservation);
	}
	catch (ParseException e) {
		System.out.println(e.getMessage());
	}
	catch (DomainException e) {
		System.out.println(e.getMessage());
	}
	catch (RuntimeException e ) {
		System.out.println("Unexpected error");
	}
	sc.close();
}
}
