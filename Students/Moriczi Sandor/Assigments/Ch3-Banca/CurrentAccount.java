
public class CurrentAccount extends Account {

	public double maxValue;
	public CurrentAccount(int number, double val) {
		super(number);
		this.maxValue=val;
	}
	public CurrentAccount() {
		super(10);
		this.maxValue=5000;
	}
	public void overdraft()
	{
		if(this.getBalance()<=0)
		{
			System.out.println("warning, you are out of money");
		}
	}
	public void setMaxValue(double val)
	{
		this.maxValue=val;
	}

	public double getValue() {
		return this.maxValue;
	}
}

