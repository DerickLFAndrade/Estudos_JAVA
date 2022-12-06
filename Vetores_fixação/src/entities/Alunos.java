package entities;

public class Alunos {
private String nome;
private double nota_1;
private double nota_2;

public Alunos(String nome, double nota_1, double nota_2) {
	super();
	this.nome = nome;
	this.nota_1 = nota_1;
	this.nota_2 = nota_2;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getNota_1() {
	return nota_1;
}
public void setNota_1(double nota_1) {
	this.nota_1 = nota_1;
}
public double getNota_2() {
	return nota_2;
}
public void setNota_2(double nota_2) {
	this.nota_2 = nota_2;
}

public double CalcularNota() {
	return (nota_1 + nota_2)/2;
}
public boolean VerificaAprovacao() {
	if(CalcularNota() >= 6) {
		return true;
	}
	else {
		return false;
	}
}
}
