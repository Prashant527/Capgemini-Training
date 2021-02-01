import java.util.Scanner;
class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        if(user.equals("Ajay") && pass.equals("password")){
            return("Welcome Ajay");
        }
        else{
            return("You have entered wrong credentials ,please enter the right credentials.");
			loginUser(user,pass);
        }
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        String pass=sc.nextLine();
        Login obj=new Login();
        System.out.println(obj.loginUser(user,pass));
        
    }
}