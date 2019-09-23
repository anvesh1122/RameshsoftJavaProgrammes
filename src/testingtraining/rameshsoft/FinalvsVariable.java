package testingtraining.rameshsoft;

public class FinalvsVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test v=new Test();
//System.out.println(v.a);
v.hel();
System.out.println(v.a);

Test12 y=new Test12();
System.out.println(y.w);
y.go();
Test123 r=new Test123();
r.ch();
	}
}
 class Test{
	final public int a=1050;
	public void hel()
	{
 //  a=2220;
	}
}
class Test12{
	final public String w="hero";
	public void go()
	{
  // w="zero";
	}
}
class Test123{
	final public static char s='G';
		// TODO Auto-generated method stub
	public void ch(){
		System.out.println(" "+s);
		//s='k';
	}
}

