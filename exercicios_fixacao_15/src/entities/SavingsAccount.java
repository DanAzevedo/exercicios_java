package entities;

public final class SavingsAccount extends Account{
	// atributos
	private Double interestRate;
	
	// construtores
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	// métodos
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withdraw(Double amount) {
		balance -= amount;
	}
	
	// getters and setters
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
