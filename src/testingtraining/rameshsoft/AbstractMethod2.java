package testingtraining.rameshsoft;

abstract public class AbstractMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Testm2 te=new Testm2();
//te.me();
//te.you();
//te.i();

Testm1 test=new Testm2();
test.me();
test.you();
//test.i();

	}

}
abstract class Testm1{
	
	public void me()
	{
		System.out.println("Anvesh");
	}
public abstract void you();
	//System.out.println("aaaaa");
}

class Testm2 extends Testm1
{
	public void i(){
		System.out.println("be careful");
	}
public void you(){
	System.out.println("what happens");

}
}