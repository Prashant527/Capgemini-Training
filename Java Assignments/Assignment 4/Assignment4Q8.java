import java.util.ArrayList;
import java.util.List;

public class Assignment4Q8 extends Thread
{
	public static void printlistusingThread(List<Integer> list) {
    	for(Integer s:list) {
    		System.out.println(s);
    	}
	}
	public static void main(String[] args) {
		Assignment4Q8 obj=new Assignment4Q8();
		obj.start();
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		printlistusingThread(list);
		
	}

}


