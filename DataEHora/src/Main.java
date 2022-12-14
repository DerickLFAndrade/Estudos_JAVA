import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
public static void main (String[] args) throws ParseException {
	Scanner sc = new Scanner(System.in);
	
	LocalDate d01 = LocalDate.now();
	LocalDateTime d02 = LocalDateTime.now();
	Instant d03 = Instant.parse("2022-11-28T00:26:26Z");
	
	LocalDate d04 = LocalDate.parse("2022-07-20");
	LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
	System.out.println(d01 + " - " + d02);
	System.out.println(d03);
	System.out.println(d04);
	System.out.println(d05);
	System.out.println("-----------------------------------------------");
	System.out.println();
	
	DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

	System.out.println(d01.format(format1));
	System.out.println(format2.format(d03));
	System.out.println("-----------------------------------------------");
	
	LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
	System.out.println(r1);
	System.out.println("-----------------------------------------------");
	
	LocalDate semanaPassada = d01.minusDays(7);
	System.out.println(d01);
	System.out.println(semanaPassada);
	LocalDate semanaQueVem = d01.plusDays(7);
	System.out.println(semanaQueVem);
	Instant d010 = Instant.now();
	Instant Ismq = d010.plus(7, ChronoUnit.DAYS);
	Instant spassada = d010.minus(7, ChronoUnit.DAYS);
	System.out.println(Ismq);
	System.out.println(spassada);
	System.out.println("-----------------------------------------------");
	
	Duration t1 = Duration.between(Ismq, spassada);
	System.out.println(t1.toDays());
	System.out.println("-----------------------------------------------");
	
	SimpleDateFormat sdfm1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfm2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date y1 = sdfm1.parse("29/11/2022");
	Date y2 = sdfm2.parse("29/11/2022 22:57:00");
	
	System.out.println(y1);
	System.out.println(y2);
	
	sc.close();
}
}
