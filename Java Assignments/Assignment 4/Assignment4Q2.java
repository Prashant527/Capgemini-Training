import java.util.ArrayList;
import java.util.List;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    
    public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
		
	}


	public static void main(String[] args) {
		List<Assignment4Q2> list=new ArrayList<>();
		Assignment4Q2 obj1=new Assignment4Q2(10000,"Accepted");
		Assignment4Q2 obj2=new Assignment4Q2(20000,"Accepted");
		Assignment4Q2 obj3=new Assignment4Q2(30000,"Rejected");
		Assignment4Q2 obj4=new Assignment4Q2(30000,"Completed");
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.forEach((e)->{
			if(e.totalPrice>10000 && e.status=="Accepted"||e.status=="Completed") {
				System.out.println(e.totalPrice+" "+e.status);
			}
		});
	}
}

