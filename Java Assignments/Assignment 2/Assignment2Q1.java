class SingletonInheritanceCheck{
  private static SingletonInheritanceCheck dbObj;
  private SingletonInheritanceCheck(){
	  
  }
   public static SingletonInheritanceCheck getInstance() {
      if(dbObj == null) {
         dbObj = new SingletonInheritanceCheck();
      }
       return dbObj;
   }
   public void getConnection() {
       System.out.println("You are now connected to the SingletonInheritanceCheck");
   }
}

public class Assignment2Q1 {
 public static void main(String[] args){
 SingletonInheritanceCheck obj1;
 obj1=SingletonInheritanceCheck.getInstance();
 obj1.getConnection();
 }
}

