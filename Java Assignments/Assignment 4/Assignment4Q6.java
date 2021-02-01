
import java.util.ArrayList;
import java.util.List;

public class Assignment4Q6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Bibek");
    	list.add("Chetan");
    	list.add("Mithlesh");
    	list.add("Rishab");
    	list.add("Prashant");
		
		convertToUpperCase(list);
	}
    public static List<String> convertToUpperCase(List<String> list) {
    	for(String s:list) {
    		System.out.println(s.toUpperCase());
    	}
		return list;

    } 
}
