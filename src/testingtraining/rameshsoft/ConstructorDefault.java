package testingtraining.rameshsoft;

public class ConstructorDefault {

	int a;
	int b;
	public ConstructorDefault()
	{

		int n=123;
		String name="behappy";
		float f=1.09f;
	System.out.println(" "+n);
	System.out.println(" "+name);
	System.out.println(" "+f);
	}
	public void subbu()
	{
		System.out.println(a+"  "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDefault con=new ConstructorDefault();
		con.subbu();
		Construct co=new Construct();
		construct1 c=new construct1();
	}

}
class Construct{
	public Construct()
	{
	
		String w="workbook";
		int n=5,m=4;
		int p=m+n;
		int i=3,j=2;
		int k=i*j;
		System.out.println(" "+w);
		System.out.println(p+"="+m+"+"+n);
		System.out.println(k+"="+i+"*"+j);
	}
}
class construct1{
	public construct1()
	{
		char c='r';
		System.out.println(" "+c);
	}

	}
