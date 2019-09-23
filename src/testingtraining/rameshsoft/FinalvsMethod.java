package testingtraining.rameshsoft;

public class FinalvsMethod {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 t=new Test2();
t.bank();
Test1 t1=new Test1();
//t1.bank();
t1.area();
	}

}
class Test2{
	   public void bank(){
		  int balance=500;
		System.out.println("HDFC");
		System.out.println(" "+balance);
	}

}

class Test1 extends Test2
{
	 public void bank(){
	System.out.println("SBI");
	}
final public void area(){
	System.out.println("Hyderabad");
}
}
