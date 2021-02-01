import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment3Q3 {

	public static void main(String[] args) {
		ArrayList<String> set=new ArrayList<>();
		set.add("Chetan");
		set.add("Bibek");
		set.add("Rishab");
		set.add("Prashant");
		set.add("Mithlesh");
		ListIterator<String> i=set.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-------IN REVERSE ORDER-------");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}
