package methods;

public class Test12 {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}

	public void add(double a, double b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, double b, double c) {
		System.out.println(a + b + c);

	}
	public static void main(String[] args) {
		Test12 t=new Test12();
		t.add(10,45.90);
		t.add(10,20);
		t.add(30,70);
		
		
		
	}

}
