
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
   
    public static String processWords(List<String> list) {
    	for(String s:list) {
    		System.out.println(s.charAt(0));
    	}
		return null;
    }
		
    public static void main(String[] args) {
    	List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    	Consumer<List<String>> c1=Assignment4Q5::processWords;
    	c1.accept(list);
    }  	
}

