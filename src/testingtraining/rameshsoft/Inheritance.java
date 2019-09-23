package testingtraining.rameshsoft;



	class Men{
		public void login(){
			System.out.println("login");
		}
		public void gadgets(){
			System.out.println("mobiles");
	}
		public void logout(){
			System.out.println("logout");
		}
	}
	class Women extends Men{
		public void cosmotics(){
			System.out.println("sun lotion");
		}
	}
	class Child extends Men{
		public void toys(){
			System.out.println("Teddy");
		}
	}
	class Vechicles extends Men{
		public void car(){
			System.out.println("BMW");
		}
	}
	public class Inheritance {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
    Men m=new Men();
    m.login();
    m.gadgets();
    m.logout();
    
    Men a=new Women();
    a.login();
    a.gadgets();
    a.logout();
    
    
   Women w=new Women();
   w.login();
   w.cosmotics();
   w.logout();
    
    Child c=new Child();
    c.login();
    c.gadgets();
    c.toys();
    c.logout();
    
   // Vechicles v=new Vechicles();
   // v.login();
   // v.car();
    //v.logout();
    
  	
	}

}
