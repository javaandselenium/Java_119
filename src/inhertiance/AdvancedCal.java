package inhertiance;

public class AdvancedCal extends Basiccal{
	
	public void sinTeta() {
		System.out.println("sinteta");
	}
	
	public void coseTeta() {
		System.out.println("cosTeta");
	}

	public static void main(String[] args) {
	AdvancedCal c=new AdvancedCal();
	c.sinTeta();
	c.coseTeta();
	c.add();
	c.sub();


	}

}
