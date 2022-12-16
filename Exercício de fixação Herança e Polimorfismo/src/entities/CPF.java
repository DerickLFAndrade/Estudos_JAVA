package entities;

public class CPF extends People{
	private Double healthExpenses;
	public CPF(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = annualIncome;
	}

	@Override
	public Double totalTaxes() {
		return healthExpenses;
	}

}
