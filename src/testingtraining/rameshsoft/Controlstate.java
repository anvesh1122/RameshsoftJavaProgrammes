package testingtraining.rameshsoft;

public class Controlstate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlstate1 v=new Controlstate1();
		 v.call();
		 Controlstate2 w=new Controlstate2();
		 w.rev();
		 Controlstate3.goo();
		 
		 String kingofforest="Lion";
	switch(kingofforest)
	{
	case"Lion":
		System.out.println("Lion");
		break;
	case"tiger":
		System.out.println("tiger");
	break;
	case"horse":
		System.out.println("horse");
		break;
		
	}
	}
}
	class Controlstate1{
	  public void call(){
	String fast="leopard";
	switch(fast){
	case"leopard":
		System.out.println("leopard");
           break;
	case"elephant":
		System.out.println("elephant");
	break;
	case"Null":
		System.out.println("Null");
		break;
	case"rabbit":
		System.out.println("rabbit");
		break;
	default:
	System.out.println("default");
		break;
		}
	}
	}
	class Controlstate2{
		public static void rev(){
			String div="car";
			switch(div){
			case"motorcycle":
				System.out.println("motorcycle");
				break;
			case"car":
				System.out.println("car");
				break;
			default:
				System.out.println("default");
					break;
			}
		}
	
			
		}
	class Controlstate3{
		public static void goo(){
			int a=1222;
			switch(a){
			case 1222:
				System.out.println("1222");
				break;
			case 2223:
				System.out.println("2223");
				break;
			}
		}
	}

		 
			
		

		

