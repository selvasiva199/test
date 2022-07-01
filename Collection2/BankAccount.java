package Collection2;

public class BankAccount {
	private long accountNumber;
	private String ifscCode;
	private String customerName;
	private int accountBalance;
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode=ifscCode;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance=accountBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getIfscCode( ) {
		return ifscCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public BankAccount(long accountNumber,String ifscCode,String customerName,int accountBalance) {
		this.accountNumber=accountNumber;
		this.ifscCode=ifscCode;
		this.customerName=customerName;
		this.accountBalance=accountBalance;
	}
	public String toString() {
		return getAccountNumber()+getIfscCode()+getCustomerName()+getAccountBalance();
	}
	
		
	}
	


