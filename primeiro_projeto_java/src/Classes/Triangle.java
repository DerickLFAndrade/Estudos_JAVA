package Classes;

public class Triangle {
public double a;
public double b;
public double c;

public double Calcular_Area() {
	double result;
	double p = (a + b + c) / 2;
	result = Math.sqrt(p * (p - a) * (p-b) * (p-c));
	return result;
}
}
