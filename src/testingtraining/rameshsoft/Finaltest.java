package testingtraining.rameshsoft;

public class Finaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc a=new Abc();
		a.job();
		//b=new Bc();
		//b.practice();
	}
	}
	
	class Abc extends Bc{
	private  void practice()
	{
		System.out.println("4 hours");
	}
	}
	
	class Bc{
		public void job(){
		System.out.println("java with selenium");
}
	}