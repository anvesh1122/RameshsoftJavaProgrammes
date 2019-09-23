package testingtraining.rameshsoft;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsuranceCa  c=new InsuranceCa();
		c.healthinsurance();
		c.vechicleinsurance();
		c.payment();
		c.policy();
		c.lifeinsurance();
	c.cash();
		
		Insurance i=new InsuranceCa();
	//	i.cash();
		i.healthinsurance();
		i.lifeinsurance();
		i.payment();
		//i.policy();
		i.vechicleinsurance();
		
		InsuranceV v=new InsuranceCa();
		v.healthinsurance();
		v.payment();
		v.policy();
		v.vechicleinsurance();
		v.lifeinsurance();
	//	v.cash();

	}

}
abstract interface Insurance{
	public void healthinsurance();
	public void vechicleinsurance();
  public void lifeinsurance();
  public void payment();
 // public void cash();
 // public void policy();
}
abstract class InsuranceH implements Insurance {
	public void healthinsurance()
	{
		System.out.println("health issues");
	}
	public void payment()
	{
		System.out.println("online payment");
	}
	public void policy()
	{
		System.out.println("rules of insurance");
	}
}
abstract class InsuranceV extends InsuranceH
{
		
	public void vechicleinsurance(){
		System.out.println("car and bike");
	}
        public void lifeinsurance(){
			System.out.println("50 years");
		}
	}
	 class InsuranceCa extends  InsuranceV
	 {
		public void cash(){
			System.out.println("5 lakhs");
		}
	}
