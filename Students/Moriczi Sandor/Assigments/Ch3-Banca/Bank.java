
public class Bank {
	public static void update(Account[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i] instanceof SavingsAccount)
			{
				a[i].deposit(100);
			}
			else
				((CurrentAccount)a[i]).overdraft();
		}
	}
	public static void main(String[] args) {
	Account[] a = new Account[5];
	for(int i=0;i<5;i++)
	{
		if(i%2==0)
			a[i]= new SavingsAccount();
		else
			a[i]= new CurrentAccount();
	}
	//Bank.update(a);
	Account b= new Account(123);
	b.deposit(123);
	SavingsAccount s= new SavingsAccount();
	s.deposit(10);
	s.addInterest();
	System.out.println(s.getBalance());
	
}
}
