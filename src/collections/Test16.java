package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test16 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1000);
		a.add(100);
		a.add(10);
		a.add(1);
		System.out.println("before suffling "+a);
		Collections.shuffle(a);
		System.out.println("after suffling "+a);

	}

}
