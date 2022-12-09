import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Main {
public static void main (String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Comment c1 = new Comment("Have a nice trip!");
	Comment c2 = new Comment("Wor that's awesome!");
	Post post_1 = new Post(sdf.parse("21/06/2022 13:05:44"), "Traveling to New Zealand", "I'm goint vist this wonderful country!", 12);
	
	post_1.addComment(c1);
	post_1.addComment(c2);
	System.out.println(post_1);
	
	sc.close();
}
}
