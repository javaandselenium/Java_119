package a1;

import accessSpecifiers.Test1;
import accessSpecifiers.Test3;
import accessSpecifiers.Test4;
import accessSpecifiers.Test5;

public class Test0 extends Test5{

	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println(t.a);
		t.add();
		
		Test0 t5=new Test0();
		System.out.println(t5.a);
		t5.add();

	}

}
