package Main;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc =  new Scanner (System.in);
	Aluno x = new Aluno();
	
	System.out.println("Nome do aluno: ");
	x.nome = sc.next();
	System.out.println("Nota 1° trimestre (max 30 pontos): ");
	x.nota_1 = sc.nextDouble();
	System.out.println("Nota 2° trimestre (max 35 pontos): ");
	x.nota_2 = sc.nextDouble();
	System.out.println("Nota 3° trimestre: (max 35 pontos)");
	x.nota_3 = sc.nextDouble();
	x.CalculaNota();
	System.out.println(x);
	sc.close();
}
}
