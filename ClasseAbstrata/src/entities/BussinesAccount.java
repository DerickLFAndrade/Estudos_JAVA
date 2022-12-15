package entities;

public class BussinesAccount extends Account {
	private Double loanLimit;
	
	public BussinesAccount() {
	}

	public BussinesAccount(String name, Integer number, Double balance, Double loanLimit) {
		super(name, number, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		deposit(amount);
	}
	
	//Herança:
	//Relação "é-um"
	//Generalização/especialização
	//Superclasse(classe base) /subclasse (classe derivada)
	//Herança / extensão
	//Herança é uma associação entre classes e não entre objetos;
}
