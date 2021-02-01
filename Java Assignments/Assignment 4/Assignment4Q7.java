import java.util.HashMap;
import java.util.Map;

public class Assignment4Q7 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Bibek",1);
		map.put("Chetan",2);
		map.put("Rishab",3);
		map.put("Prashant",4);
		convertKeyValueToString(map);

	}
	public static String convertKeyValueToString(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    String key = entry.getKey().toString();
		    Integer value = entry.getValue();
		    System.out.println("key, " + key + " value " + value);
		}
		return null;
	}

}
