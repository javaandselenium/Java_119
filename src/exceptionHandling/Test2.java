package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
	int a[]= {10,20,30,40};
	try {
	System.out.println(a[5]);
	}
	catch(ArrayIndexOutOfBoundsException a1) {
		System.out.println("handled");
	}
	
	try {
	Thread.sleep(3000);
	}
	catch(Exception e) {
		System.out.println("handled");
	}

	}
	
}
