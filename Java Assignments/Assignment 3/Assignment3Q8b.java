import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {

	
		public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
			Iterator<Integer> it=list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				if(it.next()==40) {
					list.add(50);
				}
			}
			return list;
		}
	    
	    public static void main(String args[]) {
	    	CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>();
	    	list.add(10);
	    	list.add(20);
	    	list.add(30);
	    	list.add(40);
	    	failFast(list);
	    }

	}

