package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	// constructors
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	//getter and setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	// methods
	@Override
	public final Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
