package constructoroverloading;

public class BankAccount 
{
	String Bank = "State Bank Of India";
	public static void main(String[] args)
	{
		BankAccount obj = new BankAccount();
		BankAccount bank = new BankAccount(987456123);
		BankAccount objs = new BankAccount(9797,979798.56f);
	}
	int accountnumber;
	float balance;
	BankAccount()
	{
		System.out.println(Bank);
	}
	BankAccount(int AC)
	{
		this.accountnumber = AC;
		System.out.println("AC/No - "+AC);
	}
	BankAccount(int ACno,float bal)
	{
		this.accountnumber = ACno;
		this.balance = bal;
		//System.out.println(ACno);
		System.out.println("Balance amount "+bal+" Rs");
		
	}
	

}
