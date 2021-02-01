import  java.util.*;
class Manager extends Assignment2Q2 {
    private int incentive = 5000;
    public int getSalary(int salary) {
		int total =incentive+salary;
		return (total);	
    }
}

class Labour extends Assignment2Q2 {
    private int overtime = 500;
    public int getSalary(int salary) {
		int total =overtime+salary;
		return (total);
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
	  this.salary=salary;
	  return salary;
	}
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
	 int totalempsalary=0;
	 for(Integer i:employeeSalaries){
	         totalempsalary+=i;
	}
	  return totalempsalary;
	}
    public static void main(String[] args) {
 
	}
}