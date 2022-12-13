package entities;

public class OutsourceEmployee extends Employee{
	public Double additionalCharge(Double additional) {
		return payment() + (additional + (additional*110/100));
	}
}
