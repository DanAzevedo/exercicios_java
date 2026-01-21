package entities;

public final class BusinessAccount extends Account{
	// atributos
	private Double loanLimit;

	// construtores
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	// métodos
	public void loan(double amount) {
		if(amount <= loanLimit) {
			super.balance += amount - 10;
		}
	}
	
	@Override
	public final void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

	// getters and setters	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
}
