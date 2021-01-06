package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("hola");
		a.add("selenium");
		a.add('A');

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("hello");
		a1.add("java");
		a1.add('A');

		System.out.println(a.equals(a1));
		System.out.println(a.containsAll(a1));
//		a.retainAll(a1);
//		System.out.println(a);
		a.removeAll(a1);
		System.out.println(a);

	}

}
