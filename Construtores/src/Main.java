import java.util.Scanner;

public class Main {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nome do objeto: ");
	String objeto = sc.next();
	System.out.println("Número inteiro: ");
	int numero = sc.nextInt();
	System.out.println("Número decimal: ");
	double price = sc.nextDouble();
	
	
	
	Obj obj= new Obj(objeto, numero, price);
	
	System.out.println(obj.getObjeto()+", " + obj.getnumero() +", "+ obj.getPrice());
	
	sc.close();
	
}
}
