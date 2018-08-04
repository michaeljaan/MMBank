package MoneyMoneyBank;
//class having necessary abstract factory methods
abstract public class BankFactory
{
	public abstract SavingsAcc getNewSavingsAcc(int accNo,String accNm, float accBal,boolean isSalaried);//abstract classes
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float CreditLimit);//abstract classes
}
