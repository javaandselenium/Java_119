package inhertiance;

public class B extends A{
	public void b() {
		System.out.println("b");
	}

	public static void main(String[] args) {
	B b=new B();
	b.a();
	b.b();

	}

}
