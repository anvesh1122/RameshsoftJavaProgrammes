 package testingtraining.rameshsoft;

 class ExamTestDemo {
	 
	int PracticeHrs=3;
	static String Practice = "JOB";
	
	public static void hello()
	{
		ExamTestDemo q = new ExamTestDemo();
		String  jobresp = q.Practice;

		System.out.println("JOBRESP IS ="+ jobresp);
		int PracticeRsp=q.PracticeHrs;
		System.out.println("Practice Hrs:"+PracticeRsp);
		System.out.println("forget all outside");
	}
	public static void display()
	{
		System.out.println("PRATICE WELL");
	} }
   public class ExamTest
    {

	public static void main(String[] args) {
		ExamTestDemo.display();
		ExamTestDemo.hello();
		//ExamTestDemo q;	
	}
	}
		
		
	

