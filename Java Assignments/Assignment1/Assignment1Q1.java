import java.util.Scanner;
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
	int a,c=0;
	int temp=num;
	while(num>0){
	a=num%10;  
    num=num/10;  
    c=c+(a*a*a);
	}
	if(temp==c)
	  return true;
	else
	  return false;
	}
}

public class Assignment1Q1 {
    public static void main(String[] args) {
    ArmstrongOrNot objA = new ArmstrongOrNot ( ); 
	Scanner sc= new Scanner(System.in);
	int num= sc.nextInt(); 
	System.out.println(objA.armstrongCheck(num));
	}
}
