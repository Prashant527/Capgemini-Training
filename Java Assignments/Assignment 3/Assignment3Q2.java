import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Assignment3Q2 {

	public static void main(String[] args) {
	  //LinkedHashSet<String> set=new LinkedHashSet<>();
	  HashSet<String> set=new HashSet<>();
	  set.add("Chetan");
	  set.add("Bibek");
	  set.add("Rishab");
	  set.add("Prashant");
	  set.add("Mithlesh");
	  Iterator<String> i=set.iterator();
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }
	  

	}

}
