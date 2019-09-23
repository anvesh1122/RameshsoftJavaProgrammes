package testingtraining.rameshsoft;

public class Pojotest2 {

	private String book="Step by Step";
	private String writer="Written by Anvesh";
	private int price=350;

	
	public void setBOOK(String book)
	{
		this.book=book;
	}
	public String getBOOK(){
		return book;
	}
	public void setWRITER(String writer){
		this.writer=writer;
	}
	public String getWRITER(){
		return writer;
	}
	public void setPRICE(int Price){
		this.price=price;
	}
	public int getPRICE()
	{
		return price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojotest2 po=new Pojotest2();
		po.setBOOK("Step by Step");
		System.out.println(po.getBOOK());
		po.setWRITER("Written by Anvesh");
		System.out.println(po.getWRITER());
		po.setPRICE(350);
		System.out.println(po.getPRICE());
	}

}
