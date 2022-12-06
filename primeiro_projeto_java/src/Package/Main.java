package Package;
import java.util.Scanner;

import Classes.Triangle;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  
	Triangle x, y;
	x = new Triangle();
	y = new Triangle();
	double result_x, result_y;
	
	
	System.out.println("Digite as 3 áreas do triângulo x: ");
	System.out.println("Lado 1: ");
	x.a = sc.nextDouble();
	
	System.out.println("Lado 2: ");
	
	x.b = sc.nextDouble();
	
	
	System.out.println("Lado 3: ");
	x.c = sc.nextDouble();
	
	result_x = x.Calcular_Area();
	
	System.out.println("Agora digite as 3 áreas do triângulo y: ");
	System.out.println("Lado 1: ");
	y.a = sc.nextDouble();
	
	System.out.println("Lado 2: ");
	y.b = sc.nextDouble();
	
	System.out.println("Lado 3: ");
	y.c = sc.nextDouble();
	
	result_y = y.Calcular_Area();
	
	if(result_x > result_y) {
		System.out.println("O triângulo x possui a área maior do que o triângulo y! ");
		System.out.printf("Triangulo x: %.2f %n", result_x);
		System.out.printf("Triângulo y: %.2f %n", result_y);
	} else {
		System.out.println("O triângulo y possui a área maior do que o triângulo x! ");
		System.out.printf("Triângulo x: %.2f %n", result_x);
		System.out.printf("Triângulo y: %.2f %n", result_y);
	}
	sc.close();	
	}
	
}