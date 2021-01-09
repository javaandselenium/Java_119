package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {
	
	public void demo() throws FileNotFoundException {
		FileInputStream f=new FileInputStream("./D");
		System.out.println("hello");
				
	}

	public static void main(String[] args) {
	Test5 t=new Test5();
	//try {
	t.demo();
//	}
//	catch(Exception e) {
//		System.out.println("handle");
	//}

	}

}
