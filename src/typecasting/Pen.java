package typecasting;

public class Pen extends Paper{
	public void redPen() {
		System.out.println("redpen");
	}
	
	public void bluePen() {
		System.out.println("bluepen");
	}
	
	public static void main(String[] args) {
		Paper c=new Pen();
		c.blackpaper();
		c.whitepaper();
		
		
	}

}
