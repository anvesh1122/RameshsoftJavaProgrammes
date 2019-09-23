package testingtraining.rameshsoft;

public class Multipleinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		D r=new D();
		r.bye();
		//C t=new C();
		//t.bye();
		//B y=new B();
		//y.hello();
	
	}

}
class A{
	public void hello(){
		System.out.println("practice is imp");
	}
	
}
class B {
	public void bye(){
		System.out.println("then you will get job");
	}
}
class C {
	public void see(){
		System.out.println("happy");
	}
}
	 class D extends B{
		
	}
	

	
	
	

