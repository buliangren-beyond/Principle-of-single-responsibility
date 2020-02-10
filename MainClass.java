package hld;


import java.sql.Connection;
import java.util.Scanner;

public class MainClass implements Loginform{
    public static void main(String args[]) {
    	MainClass mc = new MainClass();
    	mc.init();
    	mc.display();
    	mc.validate();
    }

	@Override
	public void init() {
		
	}

	@Override
	public void display() {
		System.out.println("”√ªß«Îµ«¬º");
		System.out.println("’À∫≈£∫");
		System.out.println("√‹¬Î£∫");
		
	}

	@Override
	public void validate() {
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();
		Scanner sc2 = new Scanner(System.in);
		String password = sc2.next();
	}
	
}
interface Loginform{
	
	void init();
	void display();
	void validate();
	UserDAO dao = new UserDAO();
	
}
class UserDAO{
	public boolean findUser(String userName,String userPassword) {
		
		return true;
	}
	
}
class DBUtil{
	public Connection getConnection() {
		return null;
	}
}