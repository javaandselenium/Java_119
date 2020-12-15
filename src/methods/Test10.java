package methods;

public class Test10 {
	int a=10;
	static int b=20;
	
	public static void add() {
		System.out.println("adding");
	}
	
	public void sub() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		Test10 t=new Test10();
		System.out.println(t.a);
		t.sub();
		
		System.out.println(Test10.b);
		add();
		
		}
	}


