package atmpackage;

import javax.jws.WebService;

@WebService
public interface Bank {
	
	public int verifyAccount(String accNum, String password) ;
	public double deposit(String accNum, double amount) ;

	public double withdraw(String accNum, double amount);

	public double balance(String accNum);

}
