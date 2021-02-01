import java.util.*;
class Rectangle5 extends Shape5 {
    public String draw() {
		return("rectangle");
	}
}

class Line5 extends Shape5{
    public String draw() {
		return("line");
	}
}

class Cube5 extends Shape5 {
    public String draw() {
		return("cube");
	}
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
		Shape5 r1=new Rectangle5();
		Shape5 l1=new Line5();
		Shape5 c1=new Cube5();
		System.out.println(r1.draw());
		System.out.println(l1.draw());
		System.out.println(c1.draw());
	}
}