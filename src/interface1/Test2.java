package interface1;

public class Test2 implements Shoppingapp{

	@Override
	public void card() {
		System.out.println("shopping card");
		
	}

	@Override
	public void addingcart() {
		System.out.println("adding prodct to cart");
	}

	@Override
	public void payment() {
		System.out.println("payment");
		
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.card();
		t.addingcart();
		t.payment();
		
		Shoppingapp.coupon();
	}

}
