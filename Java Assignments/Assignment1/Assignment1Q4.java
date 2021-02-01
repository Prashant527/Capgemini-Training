import java.util.Scanner;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        double x,y,z;
        x=subject1Marks;
        y=subject2Marks;
        z=subject3Marks;
        if(x>60||y>60||z>60){
            return ("failed");
        }
		else if(x+y+z>60){
            return("passed");
        }
        else if(x+y>60 ||y+z>60||z+x>60){
            return ("promoted");
        }
        else{
            return("failed");
        }
    }
}
public class Assignment1Q4{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double subject1=sc.nextDouble();
    double subject2=sc.nextDouble();
    double subject3=sc.nextDouble();
    ResultDeclaration obj=new ResultDeclaration();
    System.out.println(obj.declareResults(subject1,subject2,subject3));
    }
}