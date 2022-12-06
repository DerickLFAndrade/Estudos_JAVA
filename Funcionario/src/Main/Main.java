package Main;

import java.util.Scanner;

import Classes.Funcionario;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario x = new Funcionario();
		
		System.out.println("Nome do funcionário: ");
		x.name = sc.next();
		System.out.println("Salário bruto: ");
		x.salary = sc.nextDouble();
		System.out.println("Imposto: ");
		x.tax = sc.nextDouble();
		
		System.out.println(x);
		System.out.println("Qual porcentagem quer incrementar no salário?");
		double tax = sc.nextDouble();
		x.AcrescentarSalario(tax);
		System.out.println(x);
		
		sc.close();
	}
}
