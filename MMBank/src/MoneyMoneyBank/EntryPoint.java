package MoneyMoneyBank;
//main function
public class EntryPoint {

	public static void main(String[] args)
	{
		BankFactory mmBankFactory =new MMBankFactory();
		SavingsAcc mmSavingAcc = mmBankFactory.getNewSavingsAcc(101, "Mike", 8000, true);//initializing
		CurrentAcc mmCurrentAcc = mmBankFactory.getNewCurrentAcc(101, "Jaan", 6000,10000);//initializing

		
		mmSavingAcc.withdraw(500);//invoking withdraw
		System.out.println(mmSavingAcc);//display balance
		//mmSavingAcc.withdraw(500);
		//System.out.println(mmSavingAcc);
		
		mmCurrentAcc.withdraw(5000);//invoking withdraw
		System.out.println(mmCurrentAcc);//display balance
		//mmCurrentAcc.withdraw(8000);
		//System.out.println(mmCurrentAcc);
		
		mmCurrentAcc.deposit(8000);//deposit current function
		System.out.println(mmCurrentAcc);
		
		}

}
