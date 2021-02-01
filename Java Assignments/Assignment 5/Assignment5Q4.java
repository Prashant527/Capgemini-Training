import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


class Trader {
    private String name;
    private String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
    
}

class Transaction  {
    private Trader trader;
    private int year;
    private int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
    
}
public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
    	transactions.stream().filter(i->i.getYear()==2011)
    	.sorted((t1,t2)->t1.getValue()-t2.getValue()).forEach(System.out::println);
		return transactions;
    	
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
    	List<Integer> trans = new ArrayList<>();
    	transactions.stream().filter(i->i.getTrader().getCity().equalsIgnoreCase("Delhi"))
    	.forEach(System.out::println);
    	transactions.stream().forEach(i->trans.add(i.getValue()));
    	return trans;
    	
    }
    public static int highestTransaction(List<Transaction> transactions){
    	Optional<Transaction> tran=transactions.stream().max(Comparator.comparing(Transaction::getValue));
    	Transaction i=tran.stream().findFirst().get();
    	return i.getValue();
		
    	
    }

    public static int smallestTransaction(List<Transaction> transactions){
    	Optional<Transaction> tran= transactions.stream().min(Comparator.comparing(Transaction::getValue));
    	Transaction obj = tran.stream().findFirst().get();
    	return obj.getValue();
    	
    }

    public static void main(String[] args) {
    	
    	List<Trader> trader=new ArrayList<>();
    	Trader t1=new Trader("Bibek","Delhi");
    	Trader t2=new Trader("Chetan","Pune");
    	Trader t3=new Trader("Rishab","Delhi");
    	Trader t4=new Trader("Mithlesh","Ranchi");
    	Trader t5=new Trader("Raj","Patna");
    	trader.add(t1);
    	trader.add(t2);
    	trader.add(t3);
    	trader.add(t4);
    	trader.add(t5);
    	
    	List<Transaction> transaction=new ArrayList<>();
    	
    	Transaction tr1=new Transaction(t1,2010,500);
    	Transaction tr2=new Transaction(t2,2011,700);
    	Transaction tr3=new Transaction(t3,2011,400);
    	Transaction tr4=new Transaction(t4,2012,900);
    	Transaction tr5=new Transaction(t5,2015,600);
    	transaction.add(tr1);
    	transaction.add(tr2);
    	transaction.add(tr3);
    	transaction.add(tr4);
    	transaction.add(tr5);
    	System.out.println("Transaction in year 2011:-");
    	sortTransactions(transaction);
    	System.out.println("Transaction By Delhi Traders-");
    	transactionsValuesDelhi(transaction);
    	System.out.println("Highest Transaction By Traders-");
    	System.out.println(highestTransaction(transaction));
    	System.out.println("Smallest Transaction By Traders-");
    	System.out.println(smallestTransaction(transaction));
    
    	
    }
}


