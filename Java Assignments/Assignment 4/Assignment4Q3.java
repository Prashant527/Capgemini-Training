	
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.*;

public class Assignment4Q3 {
    static void modifyValue(String name){
    	System.out.println(name+" is applying functional interface.");
    }
    static Integer Sum(List<Integer> l1){
    	return l1.stream()  
                .mapToInt(Integer::intValue)  
                .sum();
    	}
    static boolean display(int age) { 
    	if(age>=25)
    		return true;
    	else
    		return false;
    	
    }
   
    public static void main(String[] args) {
    	Consumer<String> c1=Assignment4Q3::modifyValue;
    	c1.accept("Raj");
    	Predicate<Integer> p1=Assignment4Q3::display;
    	boolean b1=p1.test(24);
    	System.out.println(b1);
    	List<Integer> l1=new ArrayList<Integer>();
    	l1.add(1);
    	l1.add(2);
    	l1.add(4);
    	Function<List<Integer>,Integer> fun=Assignment4Q3::Sum;
    	int productvalue=fun.apply(l1);
    	System.out.println(productvalue);

        Supplier<Integer> random=() -> new Random().nextInt(10);
        Stream.generate(random)
                        .limit(5)
                        .forEach(System.out::println);
    	
    	}
}