package testingtraining.rameshsoft;

public class DirectIntialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectIntialization d=new DirectIntialization();
		d.main();
		d.minus();
		div();
		int a=12,b=13;
		int c=5;
		int j=a+b+c;
		//c=a+b;
		System.out.println(j+" "+a+b+c);
	}
	public void main()
	{
		int x=15,y=25;
		int z=x*y;
		System.out.println(" "+z);
	}
	public void minus()
	{
		int p=1000,q=300;
		int r=p-q;
		System.out.println(" "+r);
	}
	public static void div( )
	{
		int t=120,u=60;
		int s=t/u;
		System.out.println(" "+s);
	}
}
