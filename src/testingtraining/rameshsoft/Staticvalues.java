package testingtraining.rameshsoft;

public class Staticvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name="NAME:Anvesh Chilakaraju";
  System.out.println(" "+name);
  Static1 x=new Static1();
  x.Address();
  Static2 y=new Static2();
  y.town();
  Static3.home();
  Static5.pin();
  Static4.in();
	}
}
class Static1{
	public void Address(){
		String name1="FATHER NAME:Shankar";
		System.out.println(" "+name1);
	}
}
class Static2{
	public void town(){
		String name2="TOWN:  Huzurnagar";
		System.out.println(" "+name2);
	}
}
class Static3{
	public static void home(){
		 String hm="HOUSE NO:1-42/c";
		 System.out.println(" "+hm);
		 
	}
}
class Static4{
	public static void in(){
		String ur="STATE:Telangana";
		System.out.println(" "+ur);
	}
}
class Static5{
	public static void pin()
	{
		String pi="PINCODE:508204";
		System.out.println(" "+pi);
	}
}