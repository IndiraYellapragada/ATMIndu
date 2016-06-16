
package atmpackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the atmpackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DepositResponse_QNAME = new QName("http://atmpackage/", "depositResponse");
    private final static QName _VerifyAccountResponse_QNAME = new QName("http://atmpackage/", "verifyAccountResponse");
    private final static QName _BalanceResponse_QNAME = new QName("http://atmpackage/", "balanceResponse");
    private final static QName _Balance_QNAME = new QName("http://atmpackage/", "balance");
    private final static QName _VerifyAccount_QNAME = new QName("http://atmpackage/", "verifyAccount");
    private final static QName _Deposit_QNAME = new QName("http://atmpackage/", "deposit");
    private final static QName _Withdraw_QNAME = new QName("http://atmpackage/", "withdraw");
    private final static QName _WithdrawResponse_QNAME = new QName("http://atmpackage/", "withdrawResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: atmpackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link VerifyAccountResponse }
     * 
     */
    public VerifyAccountResponse createVerifyAccountResponse() {
        return new VerifyAccountResponse();
    }

    /**
     * Create an instance of {@link Balance }
     * 
     */
    public Balance createBalance() {
        return new Balance();
    }

    /**
     * Create an instance of {@link VerifyAccount }
     * 
     */
    public VerifyAccount createVerifyAccount() {
        return new VerifyAccount();
    }

    /**
     * Create an instance of {@link BalanceResponse }
     * 
     */
    public BalanceResponse createBalanceResponse() {
        return new BalanceResponse();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atmpackage/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atmpackage/", name = "verifyAccountResponse")
    public JAXBElement<VerifyAccountResponse> createVerifyAccountResponse(VerifyAccountResponse value) {
        return new JAXBElement<VerifyAccountResponse>(_VerifyAccountResponse_QNAME, VerifyAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atmpackage/", name = "balanceResponse")
    public JAXBElement<BalanceResponse> createBalanceResponse(BalanceResponse value) {
        return new JAXBElement<BalanceResponse>(_BalanceResponse_QNAME, BalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Balance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atmpackage/", name = "balance")
    public JAXBElement<Balance> createBalance(Balance value) {
        return new JAXBElement<Balance>(_Balance_QNAME, Balance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atmpackage/", name = "verifyAccount")
    public JAXBElement<VerifyAccount> createVerifyAccount(VerifyAccount value) {
        return new JAXBElement<VerifyAccount>(_VerifyAccount_QNAME, VerifyAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atmpackage/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atmpackage/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atmpackage/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<WithdrawResponse>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

}
