package exceptionHandling;

public class Test4 {

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		
		finally {
			System.out.println("hello");
		}

	}

}
