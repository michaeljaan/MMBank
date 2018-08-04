package MoneyMoneyBank;
//abstract current acc class
public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)//constructor
	{
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	abstract public void withdraw(float money);//abstract method
	
	@Override
	public String toString()//display function
	{
		return "Current [Creditlimit= " + creditLimit + ", toString()="+ super.toString() + "]";
	}
	public float getCreditLimit()//getter
	{
		return creditLimit;
	}
}
