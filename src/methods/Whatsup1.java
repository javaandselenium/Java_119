package methods;

public class Whatsup1 extends WhatsUp{
	
	public void status() {
		System.out.println("message and photos and videos");
		super.status();
	}

	public static void main(String[] args) {
		Whatsup1 w=new Whatsup1();
		w.status();

	}

}
