package atmpackage;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BankImpl implements Bank {

	private String accountNum;
	private String password;
	double balance;
	int accountError = 1;
	int pwdError = 2;
	int acctpwdError =3;
	int success = 0;
	
	public BankImpl()
	{
		System.out.println("in constructor");

	}
	

	public BankImpl(String accNum, String pwd, double balance)
	{
		this.accountNum = accNum;
		this.password = pwd;
		this.balance = balance;
	}

	
	@WebMethod
	public double deposit(String accNum, double amount) {
		// TODO Auto-generated method stub

		balance += amount;
		return balance;
	}

	
	@WebMethod
	public double withdraw(String accNum, double amount)  {
		// TODO Auto-generated method stub
		balance -= amount;
		return balance;
	}

	
	@WebMethod
	public double balance(String accNum)  {
		// TODO Auto-generated method stub
		try{
Thread.sleep(20000);
		}
		catch(Exception e)
		{
		}
		return balance;
		}
	

	
	@WebMethod
	public int verifyAccount(String accNum, String pwd)  {
		// TODO Auto-generated method stub
		accountNum="1234";
		password="12";
		
		if (!accNum.equals(accountNum) || accNum.isEmpty() || accNum == null) {
			if (!password.equals(pwd)) {
				return acctpwdError;
			}

			return accountError;
		}
		if (!password.equals(pwd) || pwd.isEmpty() || pwd == null) {
			if (!accNum.equals(accountNum)) {
				return acctpwdError;
			}
			return pwdError;
		}

		return 0;
	}
}
