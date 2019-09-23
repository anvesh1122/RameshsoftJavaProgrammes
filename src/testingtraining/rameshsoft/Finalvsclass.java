package testingtraining.rameshsoft;

public class Finalvsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aone a=new Aone();
		a.salary();
	
		Aone b=new Aone();
		b.salary();
		
	}

}
final class Aone {
	public void salary(){
	System.out.println("60k");	
	}
}
/*class Bone extends Aone{
	public void company(){
		System.out.println("NoIdea");
	}
}*/