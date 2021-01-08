package collections;

import java.util.HashMap;

public class Test12 {

	public static void main(String[] args) {
	HashMap<String,Integer>t=new HashMap<String,Integer>();
	t.put("ramesh",1234);
    t.put("Ganesh",6789);
    t.put("Mahesh",9876);
    t.put("Suresh",1234);
    t.put("ramesh",1234);
    System.out.println(t);

	}

}
