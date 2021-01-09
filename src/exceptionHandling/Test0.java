package exceptionHandling;

import java.io.FileInputStream;

public class Test0 {

	public static void main(String[] args) {
		try {
	int i=1/0;
		}
		catch(ArithmeticException a) {
	System.out.println("handled");
	}
		System.out.println("hello");

	}}
