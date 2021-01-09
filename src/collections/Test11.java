package collections;

import java.util.TreeMap;

public class Test11 {

	public static void main(String[] args) {
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
	     t.put("Ramesh",1234);
	     t.put("Ganesh",6789);
	     t.put("Mahesh",9876);
	     t.put("Suresh",1234);
	     t.put("Ramesh",1234);
	     System.out.println(t);
	}

}
