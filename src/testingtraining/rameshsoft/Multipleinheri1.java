package testingtraining.rameshsoft;
public class Multipleinheri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ obj = new XYZ();
		obj.myMethod();
		//XYZ hyd=new DEF();
		//hyd.myMethod();
	//	hyd.childspecificMethod();
   //DEF oy=new DEF();
		//oy.myMethod();
		DEF def=new DEF();
		def.childspecificMethod();
		def.myMethod();

	}

}
class ABCTest{
	    public void myMethod(){
		System.out.println("Overridden Method");
	   }
	}
class XYZ extends ABCTest{

    public void myMethod(){
	System.out.println("Overriding Method");
   }
}

class DEF extends  XYZ{
public void myMethod(){
	System.out.println("overflow");
	}
	public void childspecificMethod(){
		System.out.println("abcdefg");
	}
	}


