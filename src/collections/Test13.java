package collections;

import java.util.LinkedHashMap;

public class Test13 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer>t=new LinkedHashMap<String,Integer>();
		t.put("ramesh",1234);
	    t.put("Ganesh",6789);
	    t.put("Mahesh",9876);
	    t.put("Suresh",1234);
	    t.put("ramesh",1234);
	    System.out.println(t);
	    System.out.println(t.keySet());
	    System.out.println(t.values());

	}

}
