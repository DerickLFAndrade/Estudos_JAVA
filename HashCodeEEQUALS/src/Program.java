import java.util.Scanner;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Cliente c1 = new Cliente("Maria", "maria@gmail.com");
	Cliente c2 = new Cliente("Maria", "maria@gmail.com");
	
	String s1 = new String("Teste");
	String s2 = "Teste";
	
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.equals(c2));
	System.out.println(c1 == c2);

	System.out.println(s1 == s2);
	
	sc.close();
}
}
