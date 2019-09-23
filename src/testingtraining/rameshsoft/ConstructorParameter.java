package testingtraining.rameshsoft;

public class ConstructorParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Constructparameter cn=new Constructparameter(15,15,15+15);
     Construct2 c=new Construct2(2,3,2*3);
	}

}
class Constructparameter
{
	//String name;
	//int a;
	//char q;
	//public  Constructparameter(String name,int a,char q){
	// System.out.println(name+" "+a+" "+q);
		int a;
		int b;
		int c=a+b;
		public Constructparameter(int a,int b,int c)
		{
			
				System.out.println(a+" "+b+" "+c);
			}
	}

class Construct2
{
	int a;
	int b;
	int c=a*b;
	public Construct2(int a,int b,int c)
	{
		System.out.println(a+" "+b+" "+c);
	}
}
