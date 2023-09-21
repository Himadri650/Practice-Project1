package inheritanceDemo;

public class Homepage extends Base{
	// This is going to be child class
	
	// this is a child class method
	public void Homepagetest() {
		System.out.println("Test for Home Page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // create object of child class
		
		Homepage obj = new Homepage();
		
		obj.openbrowser("Chrome");
		login("admin", "admin");
		obj.Homepagetest();
		obj.logout();
	}

}
