package MoneyMoneyBank;

public class MMSavingsAcc extends SavingsAcc
{
	private boolean isSalaried;//instance member
	private static final float MINBAL = 1000;
	public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) //constructor
	{
		super(accNo, accNm, accBal, isSalaried);
		this.isSalaried = isSalaried;
	}
	
	@Override
	public void withdraw(float money)//overriding function for withdrawal
	{
		if(isSalaried)
		{
			if((getAccBal()-money)>=0)
			{
				setAccBal(getAccBal()-money);
			}
			else
			{
				System.out.println("Insufficient funds. Withdrawal below min balance is not allowed");//exceptional case
			}
		}
		else
		{
			if((getAccBal()-money)>=MINBAL)
			{
				setAccBal(getAccBal()-money);
			}
			else
			{
				System.out.println("Insufficient funds. Withdrawal below min balance is not allowed");//exceptional case
			}
		}
	}
	@Override
	public String toString()//display
	{
		return "MMSavingsAcc [isSalaried=" +isSalaried + ", toString()=" + super.toString() + "]";
	}
}
