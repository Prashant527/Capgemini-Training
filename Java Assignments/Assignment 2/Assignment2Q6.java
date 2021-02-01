import java.util.*;
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    public String persist() {
		return("Data is being saved in file.");
	}
}
class DatabasePersistence extends Persistence{
    public String persist() {
		return("Data is being saved in Database.");
	}
}

public class Assignment2Q6 {
    public static void main(String[] args) {
	Persistence client1=new FilePersistence();
	Persistence client2=new DatabasePersistence();
	System.out.println(client1.persist());
	System.out.println(client2.persist());
	}
}