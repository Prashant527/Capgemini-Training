
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Assignment3Q8a 
{
	public static void failFast(List<Integer> list)
	{
		Iterator<Integer> iterator =list.iterator();
		while(iterator.hasNext())
		{
		System.out.println(iterator.next());	
		list.add(60);
		}
	}
	
	public static void main(String args[])
	{
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		failFast(list);
	}
}