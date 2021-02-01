public class Assignment4Q1 {
	public static void main(String[] args) {
	    maths addition=(num1,num2)->num1+num2;
	    maths subtraction=(num1,num2)->num1-num2;
	    maths multiplication=(num1,num2)->num1*num2;
	    maths division=(num1,num2)->num1/num2;
	    
	   System.out.println(addition.math(13,5));
	   System.out.println(subtraction.math(13,5));
	   System.out.println(multiplication.math(13,5));
	   System.out.println(division.math(13,5));
    }
}
interface maths{
	public double math(double x, double y);
	
}

