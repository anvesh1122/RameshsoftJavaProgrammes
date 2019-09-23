package testingtraining.rameshsoft;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Men1 m1=new Men1();
m1.login();
m1.gadgets();
m1.logout();

//Women w=new Women();
//w.login();
//w.cosmotics();
//w.logout();

Men1 ab=new Women1();
ab.login();
ab.gadgets();
ab.logout();

//Women cd=new Men();

	}

}
class Men1{
	public void login(){
		System.out.println("login");
	}
	public void gadgets(){
		System.out.println("air conditioner");
}
	public void logout(){
		System.out.println("logout");
	}
}
class Women1 extends Men1 {
	public void cosmotics(){
		System.out.println("makeup");
	}
}
class Child1 extends Men1{
	public void toys(){
		System.out.println("Teddy bear");
	}
}