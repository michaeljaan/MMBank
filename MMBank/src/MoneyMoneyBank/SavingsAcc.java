package MoneyMoneyBank;
//abstract class to represent bank account of savings type
public abstract class SavingsAcc extends BankAcc
{
	private boolean isSalary;//instance member
	private static final float MINBAL = 1000;//minimum balance
	
	public SavingsAcc(int accNo, String accNm, float accBal, boolean isSalary )//constructor
	{
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	
	@Override
	public abstract void withdraw(float money);//abstract methods
	
	@Override
	public String toString() //display
	{
		return "SavingsAcc [isSalary" + isSalary +", toString()="+ super.toString()+ "]";
	}
}
