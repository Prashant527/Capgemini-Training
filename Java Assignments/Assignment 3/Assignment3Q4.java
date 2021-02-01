import java.util.HashMap;
import java.util.Map;

class DateClass {
    private int date;
    private int month;
    private int year;
    
	public DateClass(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "["+ date +","+month+","+year+"]";
	}
    
}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob,String employeeName){
    	for(Map.Entry<DateClass,String> entry:dob.entrySet()) {
    		System.out.println(entry.getValue()+" " + entry.getKey());	
    	}
		return employeeName;
    	
    }
    public static void main(String[] args) {
    	HashMap<DateClass, String>dob=new HashMap<>();
    	DateClass d1=new DateClass(15,01,2021);
        DateClass d2 = new DateClass(16,02,2021);
    	DateClass d3 = new DateClass(17,12,2021);
    	DateClass d4 = new DateClass(18,02,2021);
    	DateClass d5 = new DateClass(15,01,2020);
    	dob.put(d1, "Chetan");
    	dob.put(d2, "Bibek");
    	dob.put(d3, "Rahul");
    	dob.put(d4, "Rishab");
    	dob.put(d5, "Raj");
    	Assignment3Q4 obj = new Assignment3Q4();
    	String str=obj.getEmployee(dob,"");
    	System.out.println(str);
    }
}