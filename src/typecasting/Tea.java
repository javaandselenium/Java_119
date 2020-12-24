package typecasting;

public class Tea extends Coffee{
	public void redTea() {
		System.out.println("redtea");
	}
	
	public void greentea() {
		System.out.println("greentea");
	}
	
	public static void main(String[] args) {
		Coffee c=new Tea();
		c.coldcoffee();
		c.hotcoffee();
		
		Tea t=(Tea)c;
		t.coldcoffee();
		t.hotcoffee();
		t.redTea();
		t.greentea();
		
	}

}
