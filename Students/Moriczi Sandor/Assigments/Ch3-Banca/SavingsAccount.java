

public class SavingsAccount extends Account {

	public SavingsAccount(int number) {
		super(number);
	}
	public SavingsAccount()
	{
		super(10);
	}
	private Double interestRate = 0.1;

	public void addInterest() {
		super.deposit(this.getBalance() * this.interestRate);
	}

	public Double getValue() {
		return 10.0;
	}

	public void save() {

	}

	public Long getId() {
		return null;
	}
}