package testingtraining.rameshsoft;

public class AbstractvsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Btest n=new Btest();
    n.ding();
	n.dong();
	
	n.rose();
	n.bell();
}
}
abstract class Atest
{
  public abstract void ding();
  
	 public void dong(){
		System.out.println("of");
	}
	public  void bell(){
		System.out.println("childrens");
	}
}
class Btest extends Atest
{
	public void rose(){
		System.out.println("ring ring");
	}
public void ding(){
	System.out.println("boom");
}
}
