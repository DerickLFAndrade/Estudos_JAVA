package entities;

public class OutsourceEmployee extends Employee{
	private Double additionalCharge;
	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	@Override
	public Double payment() {
		return payment() + (additionalCharge + (additionalCharge*110/100));
	}
}
