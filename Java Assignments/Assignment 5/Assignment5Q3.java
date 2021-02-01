import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Trader {
	String name; 
	String city;
	
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

public class Assignment5Q3 {
    public static List<String> printUniqueCities (List <Trader> traders) {
    	List<String> addcities = new ArrayList<>();
    	traders.stream().forEach(i->addcities.add(i.getCity()));
    	List<String> uniquecities = new ArrayList<>();
    	uniquecities = addcities.stream().distinct().collect(Collectors.toList());
		return uniquecities;  
		}

    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
    	List<String> frompune = new ArrayList<>();
    	traders.stream().filter(i->i.getCity().equalsIgnoreCase("Pune")).forEach(i->frompune.add(i.getName()));
    	frompune.stream().sorted((t1,t2)->t1.compareTo(t2));
    	return frompune;
		}
    public static String allTrader3Names(List<Trader> traders) {
    	List<String> alltraders = new ArrayList<>();
    	traders.stream().forEach(i->alltraders.add(i.getName()));
    	alltraders.stream().sorted((t1,t2)->t1.compareTo(t2));
    	String str=" ";
    	for(String s:alltraders) {
    		str+=s+" ";
    	}
		return str;
		}
    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
    	ArrayList<Trader> fromindore = new ArrayList<>();
    	fromindore=(ArrayList<Trader>)traders.stream()
    			.filter(i->i.getCity().equalsIgnoreCase("indore")).collect(Collectors.toList());
    	return fromindore;
		}
	
    public static void main(String[] args) {
    	Trader t1=new Trader("Bibek","Jaipur");
    	Trader t2=new Trader("Chetan","Pune");
    	Trader t3=new Trader("Rishab","Uttrakhand");
    	Trader t4=new Trader("Mithlesh","Ranchi");
    	Trader t5=new Trader("Raj","Patna");
    	Trader t6=new Trader("Raja","Patna");
    	Trader t7=new Trader("Mohan","Pune");
    	Trader t8=new Trader("Mohan","indore");
    	Trader t9=new Trader("Patel","indore");
    	List<Trader> trader=new ArrayList<>();
    	trader.add(t1);
    	trader.add(t2);
    	trader.add(t3);
    	trader.add(t4);
    	trader.add(t5);
    	trader.add(t6);
    	trader.add(t7);
    	trader.add(t8);
    	trader.add(t9);
    	System.out.println("the unique cities where the traders work:");
    	System.out.println(printUniqueCities(trader));
    	System.out.println("all traders from Pune and sort them by name:");
    	System.out.println(tradersFromPuneSortByName(trader));
    	System.out.println("traders’ names sorted alphabetically:");
    	System.out.println(allTrader3Names(trader));
      	System.out.println("all traders from Indore:");
      	System.out.println(areAnyTradersFromIndore((ArrayList<Trader>) trader));
    }
}
