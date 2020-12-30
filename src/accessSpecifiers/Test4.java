package accessSpecifiers;

public class Test4 {
	
	int a=10;
	
	void add() {
		System.out.println("default method");
	}
	
	Test4(){
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Test4 t2=new Test4();
		System.out.println(t2.a);
		t2.add();

	}

}
