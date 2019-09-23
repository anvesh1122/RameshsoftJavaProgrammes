package testingtraining.rameshsoft;
import java.util.Scanner;
public class Scanner1234 {
	
	int a;
	String name;
	float f;
	float g;
float h;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
       String name=sc.next();
       System.out.println("enter integers");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=a+b;
       int d=a*b;
       int e=a/b;
       System.out.println("add = "+c+" \n "+"mul = "+d+"  \n "+"div =  "+e);
      // System.out.println(" "+d);
      // System.out.println(" "+e);
       System.out.println("enter flaot");
       float f=sc.nextFloat();
      
     //System.out.println(" "+h);
	}

}
class scan1 extends Scanner1234
{
	int a;
	int b;
	int c,d,e;
	/*int c=a+b;
	int d=a*b;
	int e=a/b;*/
	String name;
	float f,g;

	float h;
	
	
	public String next()
	{
		return null;
	}
	public int nextint()
	{
		return 0;
	}
		public float nextfloat()
		{
			return 0;	
		}
	}


