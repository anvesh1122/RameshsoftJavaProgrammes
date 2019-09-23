package testingtraining.rameshsoft;

public class Pojotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pojo d=new pojo();
	System.out.println(d.getname());
	System.out.println(d.getcourse());
	System.out.println(d.getfee());
	System.out.println(d.getinst());
	}
}
class pojo{
    	private String name="anvesh";
		private String course="selenium";
		private  int fee=1234;
		private  String inst="Ramesh soft";
		
		public String  getname()
		{
	     return name;
		}
  public String getcourse()
  {
	  return course;
  }
  public int getfee()
  {
	  return fee;
  }
  public String getinst()
  {
	  return inst;
  }
 

}