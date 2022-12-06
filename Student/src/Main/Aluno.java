package Main;

public class Aluno {
public String nome;
public double nota_1;
public double nota_2;
public double nota_3;
public double result;

public double CalculaNota() {
	return result = (nota_1 + nota_2 + nota_3);
} 
public String toString() {
	if(result > 60) {
		return "Final Grade: " + result +"\n" + 
				"Pass";
	}
	else {
		return "Final Grade: " + result + "\n"+
				"Failled" + "\n"+ 
				"Missing: " + (60 - result);
	}
}
}
