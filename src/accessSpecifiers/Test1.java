package accessSpecifiers;

public class Test1 {

public int a=10;

public void add() {
	System.out.println("public method");
}

public Test1() {
	System.out.println("public constructor");
}

public static void main(String[] args) {
	Test1 t=new Test1();
	System.out.println(t.a);
	t.add();
	
	Test4 t2=new Test4();
	System.out.println(t2.a);
	t2.add();
	
	Test5 t5=new Test5();
	System.out.println(t5.a);
	t5.add();
}

}
