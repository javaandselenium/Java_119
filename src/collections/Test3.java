package collections;

import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20.90);
		v.add("hello");
		v.add('A');
		v.add(10);
		v.add('B');
		v.add(true);
		v.add('A');
		v.add(10);
		v.add("rm");
		v.add('B');
		v.add(10);
		v.add(20.90);
		v.add("hello");
		v.add('A');
		v.add(10);
		v.add('B');
		v.add(true);
		v.add('A');
		v.add(10);
		v.add("rm");
		v.add('B');
		
		System.out.println("count the data inside the list "+v.size());
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("data it can hold "+v.capacity());
		

	}

}
