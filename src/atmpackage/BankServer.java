package atmpackage;

import javax.xml.ws.Endpoint;
import atmpackage.BankImpl;

public class BankServer {
	static String accNum= "1234";
	static String pwd= "12";
	static double balance= 0;
	public static void main(String[] args) {
		try
	      {  System.out.println
	                ("Constructing server implementations...");

	       BankImpl bank
	           = new BankImpl(accNum,pwd,balance);
	        

	        System.out.println
	           ("Binding server implementations to registry...");


	        Endpoint.publish("http://localhost:8080/InduATM", bank);
 
	       

	        System.out.println
	           ("Waiting for invocations from clients...");
	      }
	      catch (Exception e)
	      {
	        System.out.println("Error: " + e);
	      }

	}

}
