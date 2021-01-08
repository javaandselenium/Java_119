package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test14 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1000);
		a.add(100);
		a.add(10);
		a.add(1);
		System.out.println("Before sorting "+a);
		Collections.sort(a);
		System.out.println("After sorting "+a);
		Collections.sort(a,Collections.reverseOrder());
System.out.println("in descending order "+a);
	}

}
