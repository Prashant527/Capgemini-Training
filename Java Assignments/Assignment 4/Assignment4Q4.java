import java.util.ArrayList;

public class Assignment4Q4 {
	public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
		employeeList.removeIf(n->n.length()%2!=0);;
		return employeeList;
	
		
	}
    public static void main(String[] args) { 
    	ArrayList<String> list=new ArrayList<>();
    	list.add("Bibek");
    	list.add("Chetan");
    	list.add("Mithlesh");
    	list.add("Rishab");
    	list.add("Prashant"); 
    	System.out.println(removeOddLength(list));
    }
}
