package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test17 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1000);
		a.add(100);
		a.add(10);
		a.add(1);
		System.out.println("before swapping "+a);
		Collections.swap(a,1,2);
		System.out.println("after swapping "+a);
	}

}
