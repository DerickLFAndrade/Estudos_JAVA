package Entities;

public class Conta {
	private String nomeUsuario;
	private int numeroConta;
	private double saldo;

	public Conta() {

	}

	public Conta(String nomeUsuario, int numeroConta, double initialDeposit) {
		this.nomeUsuario = nomeUsuario;
		this.numeroConta = numeroConta;
		Deposito(initialDeposit);
	}

	public Conta(String nomeUsuario, int numeroConta) {
		this.nomeUsuario = nomeUsuario;
		this.numeroConta = numeroConta;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Deposito(double valor) {
		this.saldo += valor;
	}

	public void Saque (double valor) {
	this.saldo -= (valor + 5);
}

	public String toString() {
		return nomeUsuario + "\n" + numeroConta + "\n" + saldo;
	}

}
