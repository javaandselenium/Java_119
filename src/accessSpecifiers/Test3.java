package accessSpecifiers;

public class Test3 {
	private int a=10;
	
	private void demo() {
		System.out.println("private method");
	}
	
	private Test3() {
		System.out.println("private constructor");
	}

	public static void main(String[] args) {
		Test3 t1=new Test3();
		System.out.println(t1.a);
		t1.demo();
		
		Test4 t2=new Test4();
		System.out.println(t2.a);
		t2.add();
	}

}
