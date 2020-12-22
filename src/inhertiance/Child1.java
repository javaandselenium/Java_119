package inhertiance;

public class Child1 extends Parent1{
	public void car() {
		System.out.println("car from child1");
	}
	
	public static void main(String[] args) {
		Child1 c=new Child1();
		c.car();
		c.iceCream();
	}
	
	

}
