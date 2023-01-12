import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String path = "c:\\temp\\in.txt";
	
	try(BufferedReader bw = new BufferedReader(new FileReader(path))){
		Set<LogEntry> set = new HashSet<>();
		String line = bw.readLine();
		while(line != null) {
			String[] split = line.split(",");
			String username = split[0];
			Date moment = Date.from(Instant.parse(split[1]));
			set.add(new LogEntry(username, moment));
			line=bw.readLine();
		}
		System.out.println("Total Users: " + set.size());
	}
	catch(IOException e ) {
		e.printStackTrace();
	}
	
	sc.close();
	//set não aceita repetições
}
}
