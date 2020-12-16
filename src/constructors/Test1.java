package constructors;

public class Test1 {
	Test1(int a,int b){
		System.out.println(a+b);
	}
	
	Test1(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Test1 t=new Test1(10,30);
		Test1 t1=new Test1();

	}

}
