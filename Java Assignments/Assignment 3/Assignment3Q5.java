import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		return (emp.name.equals(this.name));
		
	}
	public int hashcode() {
		return this.id;
	}
	
	
}
public class Assignment3Q5 {
	public static void main(String[] args) {
		Employee emp1=new Employee("Bibek",1);
		Employee emp2=new Employee("Chetan",2);
		Employee emp3=new Employee("Rishab",3);
		Employee emp4=new Employee("Raj",2);
		Map<Employee,String> map=new HashMap<>();
		map.put(emp1, "Nepal");
		map.put(emp2, "India");
		map.put(emp3, "India");
		map.put(emp4, "India");

		for (Map.Entry<Employee,String> emp : map.entrySet())  
            System.out.println( "Value = " + emp.getValue());
	}
}

