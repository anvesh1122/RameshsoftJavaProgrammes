package testingtraining.rameshsoft;

class MethodHidng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Tens1 a=new Tens1();
  //  a.one();
    Tens1 b=new Tens2();//over riding
    b.one();
    b.two();
    b.three();
	}

}
class Tens1{
 public static void one(){
		System.out.println("1st rank");
	}
	 public static void two(){
		System.out.println("2nd rank");
	}
	public static void three(){
		System.out.println("3rd rank");
	}
}
class Tens2 extends Tens1{
 public  void four(){
		System.out.println("4th Rank");
 }
   public static void one(){
System.out.println("1st rank of class");
		}
  public static void two(){
	  System.out.println("2nd grade");
  }
  public static void three() {
	  System.out.println("3");
  }
}