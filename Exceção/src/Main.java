import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	method1();
	
	System.out.println("End Program!");
	

	sc.close();
}
public static void method1() {
	System.out.println("Method1 Start");
	method2();
	System.out.println("Method1 End");
}
public static void method2() {
	System.out.println("Method2 Start");
	Scanner sc = new Scanner(System.in);
	try {
	String[] vect = sc.nextLine().split(" ");	
	int position = sc.nextInt();
	System.out.println(vect[position]);
	
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Erro position fail");
		e.printStackTrace();
	}
	catch(InputMismatchException e) {
		System.out.println("Erro de input");
	}
	finally {
		System.out.println("Method2 End");
		System.out.println("Block Finally executed");
	}
	sc.close();
}
}
