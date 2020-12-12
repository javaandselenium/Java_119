package methods;

public class Test2 {
	
	static String name="Rama";
	static String bankName="ABC";
	static int balance=1000;
	static int withdrawal=500;
	
	public static void withdrawal() {
		System.out.println(balance-withdrawal);
	}
	
	public static void main(String[] args) {
		withdrawal();

	}

}
