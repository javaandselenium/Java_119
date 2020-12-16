package constructors;

public class Transfer {
	Transfer(int a) {
		System.out.println("suffient balance " + a);
	}

	Transfer(int a, double b) {
		System.out.println("Insufficeient balance " + a + b);
	}

	Transfer(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Transfer t=new Transfer(30,70.90);
		Transfer t1=new Transfer("Thank you for visisting");
	}

}
