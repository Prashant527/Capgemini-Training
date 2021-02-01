import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

class SavingAccount {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;
    
    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
    
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	public void withdraw(int amount) {
		if(this.acc_balance>=amount) {
			this.acc_balance-=amount;
		}
	}
	public void deposit(int amount) {
		this.acc_balance+=amount;
	}
	
}

class BankAccountList{

	private TreeSet<SavingAccount> savingAccounts = new TreeSet<>();

   public boolean addSavingAccount(SavingAccount savingAccount) {
	   savingAccounts.add(savingAccount);
	    return true;
	}

   public List<Integer> displaySavingAccountIds() {
   List<Integer> ids = new ArrayList<>();
   for(SavingAccount s : savingAccounts) {
   		ids.add(s.getAcc_ID());
   	}
   	List<Integer> idz = new ArrayList<>();
	ListIterator<Integer> lit = ids.listIterator(ids.size());
	while(lit.hasPrevious()) {
		idz.add(lit.previous());
	}
	return idz;
   }
}
public class Assignment3Q9 {
	public static void main(String[] args) {
		
	    SavingAccount s1=new SavingAccount(1000.0, 101, "Bibek", false);
	    SavingAccount s2=new SavingAccount(2000.0, 102, "Chetan", true);
	    SavingAccount s3=new SavingAccount(3000.0, 103, "Rishab", true);
	    SavingAccount s4=new SavingAccount(4000.0, 104, "Mithlesh", false);
	    BankAccountList li = new BankAccountList();
	    li.addSavingAccount(s1);
	    li.addSavingAccount(s2);
	    li.addSavingAccount(s3);
	    li.addSavingAccount(s4);
	    List<Integer> list=li.displaySavingAccountIds();
	    for(Integer a:list) {
	    	System.out.println(a);
	    }
		
	}
}
