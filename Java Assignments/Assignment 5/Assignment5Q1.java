import java.util.ArrayList;
import java.util.Comparator;

class Fruit {
	String name; 
	int calories; 
	int price; 
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
}
class MySort implements Comparator <Fruit> {
    @Override
    public int compare(Fruit f1, Fruit f2) {
        if(f1.getPrice()<f2.getPrice()) {
        	return 1;
        }else
        	return -1;
    }
}
public class Assignment5Q1 {

   public static ArrayList<Fruit> reverseSort(ArrayList<Fruit> fruits) {
	   System.out.println("Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories:-");
	   fruits.stream().filter(i->i.getCalories()<100).sorted((f1,f2)->f2.getCalories()-f1.getCalories())
	   .forEach(System.out::println);
		return fruits;
   }
		 
    
    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
    	System.out.println("Display color wise list of fruit names:-");
    	fruits.stream().sorted((f1,f2)->f1.getColor().compareTo(f2.getColor())).forEach(System.out::println);
		return fruits;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
    	System.out.println("Display only RED color fruits sorted as per their price in ascending order:-");
    	fruits.stream().filter(i->i.getColor().equalsIgnoreCase("Red")).sorted((f1,f2)->f1.getPrice()-f2.getPrice())
    	.forEach(System.out::println);
		return fruits;
    }

    public static void main(String[] args) {
    	Fruit f1=new Fruit("Apple", 50, 60, "red");
    	Fruit f2=new Fruit("Banana", 90, 30, "yellow");
    	Fruit f3=new Fruit("Chiku", 80, 50, "brown");
    	Fruit f4=new Fruit("Grapes", 70, 60, "green");
    	Fruit f5=new Fruit("Strawberries", 30, 100, "red");
    	Fruit f6=new Fruit("Mango", 100, 60, "yellow");
    	ArrayList<Fruit> fruits=new ArrayList<>();
    	fruits.add(f1);
    	fruits.add(f2);
    	fruits.add(f3);
    	fruits.add(f4);
    	fruits.add(f5);
    	fruits.add(f6);
    	reverseSort(fruits);
    	sort(fruits);
    	filterRedSortPrice(fruits);
    
	
    }

}

