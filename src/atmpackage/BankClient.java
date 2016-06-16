package atmpackage;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BankClient {

	public static void main(String[] args) {

        Bank bank;
BankClient clnt=new BankClient();


		String accountNumber="1234";
		String password;
		double balance =0;
		int choice = 0, amount = 0;
		int errcode = 0;
		//boolean isAccountValid=true,isPasswordValid=true;

try {
BankImpl banksrv=new BankImpl();

			URL url = new URL("http://jyothi:8080/InduATM/BankImplService?wsdl");
			
	       
	        QName qname = new QName("http://atmpackage/", "BankImplService");

	        Service service = Service.create(url, qname);
	        QName qname1 = new QName("http://atmpackage/", "BankImplPort");

	        bank = service.getPort(qname1,Bank.class);
	      
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("enter account number");
			try {
				accountNumber = br.readLine();
				System.out.println("enter password");
				password = br.readLine();
				errcode = banksrv.verifyAccount(accountNumber, password);
				if(errcode ==1){
					System.out.println("invalid account");
					return;
				}
				if(errcode == 2){
					System.out.println("invalid password");
					return;
				}
				if(errcode ==3){
					System.out.println("invalid account and password");
					return;
				}

				do {
					System.out.println("Menu ");
					System.out
							.println("1.deposit  n  d   deposit d dollars into account  n");
					System.out
							.println("2.withdraw n  d		withdraw d dollars from account n");
					System.out
							.println("3.balance  n		get the balance of account n");
					System.out.println("4.exit			program exit");
					System.out.println("enter ur option as a number ");
					choice = Integer.parseInt(br.readLine());

					switch (choice) {
					case 1:
						System.out.println("enter amount");
						amount = Integer.parseInt(br.readLine());
						if (clnt.isValidAmount(amount)) {
							balance = bank.deposit(accountNumber, amount);
							System.out.println("Deposit Successful ur balance is "+balance+"$");
						}
						break;
					case 2:
						System.out.println("enter amount");
						amount = Integer.parseInt(br.readLine());
						if (clnt.isValidAmount(amount)) {
							balance = bank.withdraw(accountNumber, amount);
							System.out.println("Withdraw Successful ur balance is "+balance+"$");
						}
						break;
					case 3:
						balance = bank.balance(accountNumber);
						System.out.println("Balance in the account is "+balance+"$");
						break;
					case 4:							
						return;
					}

				} while (true);

			} catch (IOException ie) {
				System.out.println(ie.getMessage());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Validates the amount entered by the user
	 * 
	 * @param amount
	 * @return
	 */
	boolean isValidAmount(int amount) {
		if (amount <= 0) {
			System.out.println("entered invalid amount");
			return false;
		}
		return true;
	}

}
