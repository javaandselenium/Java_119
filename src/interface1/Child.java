package interface1;

public class Child  implements Parent1,Parent2{

	@Override
	public void car() {
	System.out.println("car from parent2");
		
	}

	@Override
	public void home() {
		System.out.println("home from parent1");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.car();
		c.home();
	}

}
