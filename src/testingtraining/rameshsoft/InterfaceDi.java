package testingtraining.rameshsoft;

public class InterfaceDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		myside23 er=new myside23();
		er.sevenhours();
		er.tenhours();
		er.fourhours();
        er.hello();
        er.bye();
        er.home();
        er.inst();
	}
}
abstract interface training
{
	public void hello();
	public void bye();
}
interface training1
{
	public void tenhours();
	public void sevenhours();
	public void fourhours();
}
interface training2 
{
	public void home();
	public void inst();
}
abstract class free implements training,training1,training2
{
	public void hello(){
	System.out.println("do anything");
}
	public void bye(){
		System.out.println("for you");
}
	public  void tenhours()
	{
		System.out.println("space off");
	}
	public  void fourhours()
	{
	System.out.println("4 hours");
	}
	public  void sevenhours()
	{
		System.out.println("happiness");
	}
	public void home(){
	System.out.println("hyderabad");
}
public void inst()
{
	System.out.println("instagram");
}
}
 class myside23 extends free
{
	
}