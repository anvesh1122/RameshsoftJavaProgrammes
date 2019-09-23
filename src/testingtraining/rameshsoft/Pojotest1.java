package testingtraining.rameshsoft;

public class Pojotest1 {

	private String a="Rameshsoft";
	private  String b="Masterin";
	private int  c=1234567890;
	private String d="Real Time";
	private char f='Y';
	
	public void setA(String a1)
	{
		a=a1;
	}
	public String getA()
	{
		return a;
	}
	//setter method
public void setB(String b2)
{
	b=b2;
}
public String getB(){
	return b;
}
//getter method
public int getC(){
	return c;
}

//setter method 
public void setD(String d4)
{
	d=d4;
}
public String getD(){
	return d;
	}
public void setF(char f){
	this.f=f;
}
public char getF(){
	return f;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
  Pojotest1 e=new Pojotest1();
  e.setA("Rameshsoft");
  System.out.println(e.getA());
  e.setB("Masterin");
 System.out.println(e.getB());
  System.out.println(e.getC());
 e.setD("Real Time");
 System.out.println(e.getD());
 e.setF('Y');
 System.out.println(e.getF());
	}
}
