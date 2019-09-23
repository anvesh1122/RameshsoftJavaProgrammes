package testingtraining.rameshsoft;

public class Abstractvsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Testab4 t=new Testab4();
t.lang();
t.bye();
t.hello();
//Testab3 r= new Testab3();
//r.bye();
//Testab2 s=new Testab2();
//s.hello();
}

}
abstract class Testab1
{
	public void hello()
	{
		System.out.println("world cup");
	}
}
	class Testab2 extends Testab1
	{
		public void bye(){
			System.out.println("will win");
		}
}
class Testab3 extends Testab2
{
public void lang()
{
	System.out.println("national");
}
}
class Testab4 extends Testab3
{
	
}
