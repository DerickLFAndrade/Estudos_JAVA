import java.util.Locale;
import java.util.Scanner;

public class Main {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n = 3;
	double[] vect = new double[n];
	System.out.println("Digite o primeiro número: ");
	vect[0] = sc.nextDouble();

	System.out.println("Digite o segundo número: ");
	vect[1] = sc.nextDouble();

	System.out.println("Digite o terceiro número: ");
	vect[2] = sc.nextDouble();
	double result = 0;
	for(int i = 0; i < n; i++ ) {
		System.out.println(vect[i]);
		result += vect[i];
	}
	
	System.out.println(result/n);
	sc.close();
}
}
