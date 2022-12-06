import java.util.Scanner;

public class Main {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	Boolean mostrarVariavel = false;
	
	if(mostrarVariavel == false) {
		mostrarVariavel = true;
	} else {
		mostrarVariavel = false;
	}
	
	
	System.out.println(mostrarVariavel);
	sc.close();
}
}
