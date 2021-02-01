import java.util.Scanner;
import java.lang.Math; 
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
	double Simple_Interest;
	Simple_Interest=(principalAmount*time*interestRate)/100;
	return(Simple_Interest);
	}
    public double compoundInterest(double principalAmount,int time,double interestRate){
	double Compound_Interest;
	double x,y;
	x=time-principalAmount;
	y=1+interestRate;
	Compound_Interest=principalAmount*(Math.pow(y,x));
	return(Compound_Interest);
	}
}
public class Assignment1Q3 {
    public static void main (String args[]) {
	Scanner sc= new Scanner(System.in);
	double principalAmount= sc.nextDouble();
	int time= sc.nextInt();
	double interestRate = sc.nextDouble(); 
	SiCi obj1=new SiCi();
	SiCi obj2=new SiCi();
	System.out.println(obj1.simpleInterest(principalAmount,time,interestRate));
	System.out.println(obj2.compoundInterest(principalAmount,time,interestRate));
	}
}