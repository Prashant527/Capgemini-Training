import java.util.Scanner;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
	int i,a,c=0,flag=0;
	for(i=min;i<max;i++){
	int temp=i;
		while(i>0){
			a=i%10;  
			i=i/10;  
			c=c+(a*a*a);
		}
	}
	if(temp==c)
	 flag=1;
	else
	 flag=0;
	 
	while(flag==1){
		return temp;
	}
	}
}

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;
	   ArmstrongNumBetweenRange objA=new ArmstrongNumBetweenRange();
	   System.out.println(objA.armstrongNumbersInRange(min,max));

    }
}