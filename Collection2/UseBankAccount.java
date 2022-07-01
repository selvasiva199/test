package Collection2;
import java.util.HashMap;
import java.util.Iterator;
public class UseBankAccount {
	public static void main(String[] args) {
		BankAccount details1=new BankAccount(12345678,"icic2004","siva",250);
		BankAccount details2=new BankAccount(2315467,"ibibi005","karthi",45000);
		BankAccount details3=new BankAccount(345876,"iobi0956","raja",400000);
		BankAccount details4=new BankAccount(4532167,"kub009","dinesh",3000);
		HashMap<Long,BankAccount>accountDetails=new HashMap<>();
		accountDetails.put(details1.getAccountNumber(),details1);
		accountDetails.put(details2.getAccountNumber(), details2);
		accountDetails.put(details3.getAccountNumber(), details3);
		accountDetails.put(details4.getAccountNumber(), details4);
		//for(Long x:accountDetails.keySet()) {
		
			//System.out.println(x);
		//}
		
		for(BankAccount x:accountDetails.values()) {
			System.out.println(x.getCustomerName());
		}
		//accountDetails.forEach((x,y)->System.out.println(x+" "+y));
		//accountDetails.keySet().forEach(x->System.out.println(x));
		accountDetails.values().forEach(y->System.out.println(y.getCustomerName()));
		Iterator<BankAccount> i=accountDetails.values().iterator();
		while(i.hasNext()) {
			if(i.next().getAccountBalance()<5000) {
				i.remove();
			}
		}
		System.out.println(accountDetails.values());
		//while(i.hasNext()) {
			//System.out.println(i.next().getCustomerName());
		}
		
		}


