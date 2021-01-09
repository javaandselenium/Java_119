package exceptionHandling;

public class Test3 {
	public static void add() {
		System.out.println(2+3);
	}

	public static void main(String[] args) {
		try {
	int i=1/0;
	System.out.println(i);
		}
		finally {
			System.out.println("hello");
			System.out.println("hi");
			Test3.add();
		}

	}

}
