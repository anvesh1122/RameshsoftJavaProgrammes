package testingtraining.rameshsoft;

public class Overloading {
	public int add(int a,int b)
	{
		int res=a+b;
		System.out.println(" "+res);
	return res;
}
	
	public float add(float a,float b)
	{
		float res=a+b;
		System.out.println(" "+res);
		return res;
	}

	public double add(double a,double b)
	{
		double res=a+b;
		System.out.println(" "+res);
		return res;
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
Overloading ov=new Overloading();
ov.add(3,5);
ov.add(10.20,20.10);
ov.add(10.2f,1.2f);
ov.add('a','b');
ov.add(12.20,88);

}
}