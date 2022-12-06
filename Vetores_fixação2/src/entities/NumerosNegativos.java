package entities;

public class NumerosNegativos {
private int numeros;
public NumerosNegativos (int numeros) {
	this.numeros = numeros;
}
public int getNumeros() {
	return numeros;
}
public void setNumeros(int numeros) {
	this.numeros = numeros;
}

public String toString() {
		return "Números negativos: \n" + numeros;
}
}
