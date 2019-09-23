package testingtraining.rameshsoft;

public class methodOverriding {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    method a=new method();
	  //  a.one();
	    method b=new over();//over riding
	    b.anvesh1();
	    b.anvesh2();
	    b.anvesh3();
		}

	}

	class method{
	 public void anvesh1(){
			System.out.println("method-1");
		}
		 public void anvesh2(){
			System.out.println("method-2");
		}
		public void anvesh3(){
			System.out.println("method-3");
		}
	}
	
	//override
	class  over extends method{
	 public  void four(){
			System.out.println("over-4");
	 }
	   public  void anvesh1(){
	System.out.println("over-1");
			}
	  public void anvesh2(){
		  System.out.println("over-2");
	  }
	  public void anvesh3() {
		  System.out.println("over-3");
	  }
	}




