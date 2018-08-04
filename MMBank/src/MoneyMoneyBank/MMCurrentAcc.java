package MoneyMoneyBank;

public class MMCurrentAcc extends CurrentAcc
{
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)//constructor
	{
		super(accNo, accNm,accBal,creditLimit);
	}
	
	@Override
	public void withdraw(float money)//withdrawal function
	{
		float CL=getCreditLimit();
		float AB=getAccBal();
		if(((getAccBal()+getCreditLimit())-money)>=0)
		{
			setAccBal(getAccBal()-money);
		}
		else
		{
			System.out.println("Insufficient Fund:");
			System.exit(0);
		}
	}
	@Override
	public String toString()//display function
	{
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}
}
