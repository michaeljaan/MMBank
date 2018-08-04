package MoneyMoneyBank;
//new acc creator class
public class MMBankFactory extends BankFactory
{
	public SavingsAcc getNewSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried)//creates new savings account
	{
		SavingsAcc savingAcc =new MMSavingsAcc(accNo, accNm, accBal, isSalaried);
		return savingAcc;
	}
	
	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float CreditLimit)//creates new current account
	{
		CurrentAcc currentAcc = new MMCurrentAcc(accNo, accNm, accBal, CreditLimit);
		return currentAcc;
	}
}
