package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("hello");
		a.add("");
		a.add('A');
		a.add(true);
		a.add(20.90);
		a.add(10);
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());
//		a.clear();
//		System.out.println(a);
		a.add(3,"Selenium");
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);

	}

}
