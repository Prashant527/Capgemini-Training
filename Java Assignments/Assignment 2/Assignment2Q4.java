import java.util.*;
abstract class AbstractclassCheck{
 public abstract String firstMethod();
 public abstract int secondmethod();
}
abstract class AbstractclassCheck2{
 public int val1=100;
 public String str1="string";
 public int nonAbstractmethod(){
    int val2=500;
	return(val1+val2);
 }
}
class newclass extends AbstractclassCheck{
   public String firstMethod(){
      return("method overriding!");
   }
   public int secondmethod(){
	   return 0;
   }
}
public class Assignment2Q4{
    public static void main(String args[]){
	AbstractclassCheck obj1=new newclass();
	//AbstractclassCheck2 obj2=new AbstractclassCheck2(); abstact class can't be initiated.
	System.out.println(obj1.firstMethod());
	//System.out.println(obj2.nonAbstractmethod());
	
	}
}