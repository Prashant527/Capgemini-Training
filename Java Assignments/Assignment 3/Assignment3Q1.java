import java.util.*;

class Person implements Comparable<Person>{
	private String name;
    private int height;
    private double weight;
	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void display() {
		System.out.println("Name:"+getName()+" "+"Height:"+getHeight()+" "+"Weight:"+getWeight());
	}
	public int compareTo(Person p) {
		return Comparator.comparing(Person::getWeight)
				.thenComparing(Person::getHeight)
				.compare(this,p);
	}
}	
public class Assignment3Q1 {
	public static void main(String[] args) {
		TreeSet<Person> set=new TreeSet<Person>();
		
		Person p1=new Person("Bibek",4,65.0);
		Person p2=new Person("Chetan",6,75.0);
		Person p3=new Person("Mithlesh",6,65.0);
		Person p4=new Person("Rishab",7,55.0);
		Person p5=new Person("Prashant",5,70.0);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		for(Person per: set) {
			per.display();
		}
		
	}

}
