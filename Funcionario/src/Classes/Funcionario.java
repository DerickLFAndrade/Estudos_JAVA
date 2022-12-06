package Classes;

public class Funcionario {
	
public String name;
public double salary;
public double tax;


public void AcrescentarSalario(double porcentagem) {
	salary +=(salary/100*porcentagem);
	
}
 

public String toString() {
	return "Nome: " + name + "\n" +
			"Salário: " + (salary - tax);
}
}
