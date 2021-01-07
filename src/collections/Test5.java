package collections;

import java.util.PriorityQueue;

public class Test5 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue<>();
		p.add(20);
		p.add(30);
		p.add(10);
		p.add(100);
		p.add(1);
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println("after performing poll "+p);
		

	}

}
